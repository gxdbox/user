package com.pinxow.swapcat.toy.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class PageDto<T> {
    List<T> items;
    int currentPage;
    int pageSize;
    int totalPages;
    int totalItems;


    public PageDto(List<T> toyDtos, PageQueryRequest request, int totalPages, int totalCount) {
        this.items = toyDtos;
        this.currentPage = request.getCurrentPage();
        this.pageSize = request.getPageSize();
        this.totalPages = totalPages;
        this.totalItems = totalCount;
    }
}
