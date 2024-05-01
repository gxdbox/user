package com.pinxow.swapcat.toy.domain.dbo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "exchange")
@Data
@Builder
public class ExchangeDbo {

    @Id
    private String id;

    private String requestId;

    private String receiveId;

    private String status;

    private String message;

    private LocalDateTime createDate;
}
