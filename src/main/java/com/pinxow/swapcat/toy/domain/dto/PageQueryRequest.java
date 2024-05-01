package com.pinxow.swapcat.toy.domain.dto;

import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
public class PageQueryRequest {
    private String userId;
    private String toyName;
    private int currentPage = 1;
    private int pageSize = 10;
    private String sortField;
    private Sort.Direction sortOrder;
    private String startTime;
    private String endTime;
}
