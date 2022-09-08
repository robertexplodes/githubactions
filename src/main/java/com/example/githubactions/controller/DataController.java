package com.example.githubactions.controller;

import com.example.githubactions.domain.Person;
import com.example.githubactions.persistence.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DataController {

    private PersonRepository personRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    @GetMapping("/persons")
    public List<Person> persons() {
        return personRepository.findAll();
    }
}
