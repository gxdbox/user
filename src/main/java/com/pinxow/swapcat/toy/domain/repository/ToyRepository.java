package com.pinxow.swapcat.toy.domain.repository;

import com.pinxow.swapcat.toy.domain.dbo.ToyDbo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToyRepository extends MongoRepository<ToyDbo, String> {
}
