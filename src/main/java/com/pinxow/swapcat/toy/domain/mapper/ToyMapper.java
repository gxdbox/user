package com.pinxow.swapcat.toy.domain.mapper;

import com.pinxow.swapcat.toy.domain.dbo.ToyDbo;
import com.pinxow.swapcat.toy.domain.dto.ToyDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ToyMapper {

    ToyMapper INSTANCE = Mappers.getMapper(ToyMapper.class);

    List<ToyDto> mapToDtoList(List<ToyDbo> toyList);
}
