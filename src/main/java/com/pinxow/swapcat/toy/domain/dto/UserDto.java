package com.pinxow.swapcat.toy.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private String id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String address;

    private LocalDateTime registerDate;

    private String wechatId;

    private String wechatAccessToken;

    private LocalDateTime wechatTokenExpireTime;
}
