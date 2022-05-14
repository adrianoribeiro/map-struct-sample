package com.adrianoribeiro.dto.mapper;

import com.adrianoribeiro.domain.Car;
import com.adrianoribeiro.domain.CarDto;
import com.adrianoribeiro.domain.CarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

//Copied from https://mapstruct.org/
public class CarMapperTest {

    public static final String MAKE = "Morris";
    public static final int NUMBER_OF_SEATS = 5;
    private Car car;
    @Before
    public void init() {
        car = new Car(MAKE, NUMBER_OF_SEATS, CarType.SEDAN );
    }

    @Test
    public void shouldMapCarToDto() {
        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //then
        assertNotNull(carDto);
        assertEquals( MAKE, carDto.getMake() );
        assertEquals( NUMBER_OF_SEATS, carDto.getSeatCount() );
        assertEquals( CarType.SEDAN.toString(), carDto.getType() );
    }

    @Test
    public void shouldMapDtoToCar() {
        //given
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //when
        Car car = CarMapper.INSTANCE.carDtoToCar( carDto );

        //then
        assertNotNull(carDto);
        assertEquals( MAKE, car.getMake() );
        assertEquals( NUMBER_OF_SEATS, car.getNumberOfSeats() );
        assertEquals( CarType.SEDAN, car.getType() );
    }
}
