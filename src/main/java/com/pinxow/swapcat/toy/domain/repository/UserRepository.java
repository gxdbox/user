package com.pinxow.swapcat.toy.domain.repository;

import com.pinxow.swapcat.toy.domain.dbo.UserDbo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<UserDbo, String> {
}
