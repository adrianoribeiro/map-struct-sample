package com.adrianoribeiro.dto.mapper;

import com.adrianoribeiro.domain.Car;
import com.adrianoribeiro.domain.CarDto;
import com.adrianoribeiro.domain.CarType;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

//Copied from https://mapstruct.org/
public class CarMapperTest {

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car( "Morris", 5, CarType.SEDAN );

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //then
        assertNotNull(carDto);
        assertEquals( "Morris", carDto.getMake() );
        assertEquals( 5, carDto.getSeatCount() );
        assertEquals( "SEDAN", carDto.getType() );
    }
}
