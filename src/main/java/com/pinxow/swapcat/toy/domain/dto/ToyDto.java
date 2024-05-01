package com.pinxow.swapcat.toy.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ToyDto {
    private String id;

    private String name;

    private String description;

    private String image;

    private String userId;

    private String status;

    private LocalDateTime createDate;
}
