package com.adrianoribeiro.dto.mapper;

import com.adrianoribeiro.domain.Address;
import com.adrianoribeiro.domain.Person;
import com.adrianoribeiro.dto.PersonDto;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class PersonMapperTest {

    private Address address ;
    private Address address2;
    private Person child1;
    private Person child2;
    private Person father;


    @Before
    public void init() {
        address = new Address(1L, "Street A, 23", "Canidelo", "Vila Nova de Gaia", "4400-222");
        address2 = new Address(2L, "Street B, 77", "Gaia", "Vila Nova de Gaia", "4400-222");
        child1 = new Person(1L, "Júlia", "Ribeiro", address2, null, LocalDate.of(2000, 11, 10));
        child2 = new Person(2L, "Samuel", "Ribeiro", address2, null, LocalDate.of(2005, 11, 22));
        Set<Person> dependents = new TreeSet<>();
        dependents.add(child1);
        dependents.add(child2);
        father = new Person(2L, "Adriano", "Ribeiro", address, dependents, LocalDate.of(1990, 7, 5));
    }

    @Test
    public void shouldMapPersonToDto() {

        PersonDto dto = PersonMapper.INSTANCE.toDto(father);

        assertEquals("Adriano Ribeiro", dto.getName());
        assertEquals("Street A, 23", dto.getAddress().getLine1());

        String address = "Canidelo, Vila Nova de Gaia, 4400-222";
        assertEquals(address, dto.getAddress().getLine2());

        //Sometimes it will fail once HashSet don't ensure the order :)
        String dependents = "Júlia Ribeiro, Samuel Ribeiro";
        assertEquals(dependents, dto.getDependents());
    }
}
