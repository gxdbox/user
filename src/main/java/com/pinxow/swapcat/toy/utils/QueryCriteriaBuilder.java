package com.pinxow.swapcat.toy.utils;

import com.pinxow.swapcat.toy.domain.dto.PageQueryRequest;
import io.micrometer.common.util.StringUtils;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Date;
import java.util.regex.Pattern;

public class QueryCriteriaBuilder {

    /**
     * related  https://blog.csdn.net/yzh_1346983557/article/details/83146931
     */
    public static Query buildQuery(PageQueryRequest request) {
        int pageSize = request.getPageSize();
        int pageNum = request.getCurrentPage();
        String userId = request.getUserId();
        String sortField = request.getSortField();
        Sort.Direction sortOrder = request.getSortOrder();
        String toyName = request.getToyName();
        String startTime = request.getStartTime();
        String endTime = request.getEndTime();


        Criteria criteria = new Criteria();
        if (StringUtils.isNotBlank(userId)) {
            criteria.and("userId").is(userId);
        }

        if (StringUtils.isNotBlank(toyName)) {
            Pattern pattern = Pattern.compile("^.*" + toyName + ".*$", Pattern.CASE_INSENSITIVE);
            criteria.and("name").regex(pattern);
        }


        if (startTime != null && endTime != null) {
            criteria.andOperator(
                    Criteria.where("createDate").gte(new Date(startTime)),
                    Criteria.where("createDate").lte(new Date(endTime))
            );
        } else if (startTime != null) {
            criteria.and("createDate").gte(new Date(startTime));
        } else if (endTime != null) {
            criteria.and("createDate").lte(new Date(endTime));
        }

        Sort sort = Sort.by(sortOrder, sortField);

        return new Query(criteria).with(sort).skip((long) (pageNum - 1) * pageSize).limit(pageSize);
    }

}