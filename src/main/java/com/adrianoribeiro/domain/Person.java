package com.adrianoribeiro.domain;

import java.time.LocalDate;
import java.util.Set;

public class Person implements Comparable<Person>{
    private Long id;
    private String firstName;
    private String lastName;
    private Address address;
    private Set<Person> dependents;
    private LocalDate dateOfBirth;

    public Person(Long id, String firstName, String lastName, Address address, Set<Person> dependents, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dependents = dependents;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Set<Person> getDependents() {
        return dependents;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.getFirstName().compareTo(otherPerson.getFirstName());
    }
}
