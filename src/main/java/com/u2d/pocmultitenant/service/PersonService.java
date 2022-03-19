package com.u2d.pocmultitenant.service;

import com.u2d.pocmultitenant.dto.PersonDto;
import com.u2d.pocmultitenant.entity.Person;
import com.u2d.pocmultitenant.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    ModelMapper modelMapper;

    public PersonDto create(PersonDto personDto) {
        var person = modelMapper.map(personDto, Person.class);
        var personSaved = repository.save(person);
        return modelMapper.map(personSaved, PersonDto.class);
    }
}
