package com.adrianoribeiro.dto.mapper;

import com.adrianoribeiro.domain.Address;
import com.adrianoribeiro.domain.Person;
import com.adrianoribeiro.dto.AddressDto;
import com.adrianoribeiro.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(uses = HelperMapper.class )
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "name", source = "fullName")
    @Mapping(target = "address", source = "person.address")
    @Mapping(target = "dependents", source = "person.dependents")
    PersonDto toDto(Person person);
}

class HelperMapper{
    public AddressDto mapAddress(Address address) {
        return new AddressDto(address.getStreetAddress(),
                address.getCity() + ", " + address.getState() + ", " + address.getZipCode());
    }

    public String mapAddress(Set<Person> dependents) {
        return dependents.stream().map(Person::getFullName).collect(Collectors.joining(", "));
    }
}

