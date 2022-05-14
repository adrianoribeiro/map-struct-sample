package com.adrianoribeiro.dto.mapper;

import com.adrianoribeiro.domain.Car;
import com.adrianoribeiro.domain.CarDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);

    @InheritInverseConfiguration
    //@Mapping(target = "numberOfSeats", ignore = true)
    Car carDtoToCar(CarDto carDto);
}
