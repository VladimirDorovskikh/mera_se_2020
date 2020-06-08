package com.mer.spring.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mer.spring.dto.Person;

@Service
public class PersonService {

    final private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @PostConstruct
    private void doSomework() {
        Person p1 = new Person("Вася", "Пупкин");
        Person p2 = new Person("Иван", "Сидоров");
        Person p3 = new Person("Анна", "Иванова");
        Person p4 = new Person("Пётр", "Сидоров");

        personRepository.savePerson(p1);
        personRepository.savePerson(p2);
        personRepository.savePerson(p3);
        personRepository.savePerson(p4);
        System.out.println("doSomework вызван, люди сохранены");
    }


    public void savePerson(Person person) {
        personRepository.savePerson(person);
    }

    public List<Person> findByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }


    public void sayHelloToPerson(Person person) {
        System.out.println("Привет, " + person.getName());
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
