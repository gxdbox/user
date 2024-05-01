package com.pinxow.swapcat.toy.service;

import com.pinxow.swapcat.toy.domain.dto.PageDto;
import com.pinxow.swapcat.toy.domain.dto.PageQueryRequest;
import com.pinxow.swapcat.toy.domain.dto.ToyDto;

public interface ToyService {
    PageDto<ToyDto> getToys(PageQueryRequest request);
}
