package com.pinxow.swapcat.toy.domain.dbo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "toy")
@Data
@Builder
public class ToyDbo {

    @Id
    private String id;

    private String name;

    private String description;

    private String image;

    private String userId;

    private String status;

    private LocalDateTime createDate;
}
