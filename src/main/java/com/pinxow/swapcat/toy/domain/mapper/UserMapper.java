package com.pinxow.swapcat.toy.domain.mapper;

import com.pinxow.swapcat.toy.domain.dbo.UserDbo;
import com.pinxow.swapcat.toy.domain.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto mapUserDto(UserDbo userDbo);
}
