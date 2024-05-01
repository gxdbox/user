package com.pinxow.swapcat.toy.service.impl;

import com.pinxow.swapcat.toy.domain.dbo.ToyDbo;
import com.pinxow.swapcat.toy.domain.dto.PageDto;
import com.pinxow.swapcat.toy.domain.dto.PageQueryRequest;
import com.pinxow.swapcat.toy.domain.dto.ToyDto;
import com.pinxow.swapcat.toy.domain.mapper.ToyMapper;
import com.pinxow.swapcat.toy.service.ToyService;
import com.pinxow.swapcat.toy.utils.QueryCriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ToyServiceImpl implements ToyService {
    private final MongoTemplate mongoTemplate;

    @Override
    public PageDto<ToyDto> getToys(PageQueryRequest request) {
        Query query = QueryCriteriaBuilder.buildQuery(request);

        List<ToyDbo> toyDbos = mongoTemplate.find(query, ToyDbo.class, "toys");
        List<ToyDto> toyDtos = ToyMapper.INSTANCE.mapToDtoList(toyDbos);


        int totalCount = (int) mongoTemplate.count(query, ToyDbo.class, "toys");
        int totalPages = (int) Math.ceil(totalCount / request.getPageSize());


        return new PageDto<>(toyDtos, request, totalPages, totalCount);
    }

}
