package com.pinxow.swapcat.toy.domain.mapper;

import com.pinxow.swapcat.toy.domain.dbo.ToyDbo;
import com.pinxow.swapcat.toy.domain.dto.ToyDto;
import org.mapstruct.Mapper;

@Mapper
public interface ToyMapper {

    ToyDto mapToToyDto(ToyDbo toy);
}
