package com.pinxow.swapcat.toy.domain.dbo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "user")
@Data
@Builder
public class UserDbo {

    @Id
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
