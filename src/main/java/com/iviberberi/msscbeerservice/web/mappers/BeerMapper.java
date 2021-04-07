package com.iviberberi.msscbeerservice.web.mappers;

import com.iviberberi.msscbeerservice.domain.Beer;
import com.iviberberi.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
