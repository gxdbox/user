package com.pinxow.swapcat.toy.controller;

import com.pinxow.swapcat.toy.domain.dto.PageDto;
import com.pinxow.swapcat.toy.domain.dto.PageQueryRequest;
import com.pinxow.swapcat.toy.domain.dto.ToyDto;
import com.pinxow.swapcat.toy.service.ToyService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ToyController {

    private final ToyService toyService;

    @GetMapping
    public PageDto<ToyDto> getToyList(
            @ModelAttribute @Validated PageQueryRequest request) {
        return toyService.getToys(request);
    }
}
