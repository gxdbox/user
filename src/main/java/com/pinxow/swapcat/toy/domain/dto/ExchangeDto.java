package com.pinxow.swapcat.toy.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExchangeDto {
    private String id;

    private String requestId;

    private String receiveId;

    private String status;

    private String message;

    private LocalDateTime createDate;
}
