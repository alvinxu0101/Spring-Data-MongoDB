package com.alvinxu.serviceImpl;

import com.alvinxu.jpa.data.Person;
import com.alvinxu.repo.PersonRepo;
import com.alvinxu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Qualifier("personRepo")
    @Autowired
    PersonRepo personRepo;

    public void insertBase() {
        Person person = new Person();
        for (int i = 0; i < 100; i++) {
            person.setId(i);
            person.setAge(i);
            person.setName("alvinxu" + i);
            person.setAddress("chogn" + i);
            personRepo.insertBase(person);
        }

    }

    public Person findOne() {
        Map<String, Object> person = new HashMap<String, Object>();
        person.put("name", "alvinxu");
        return personRepo.findOne(person);
    }

    public List<Person> findAll() {
        Map<String, Object> person = new HashMap<String, Object>();
        person.put("age", "60");
        return personRepo.findAll(person);
    }

    public void update() {
        Map<String, Object> person = new HashMap<String, Object>();
        person.put("name", "alvinxu");
        person.put("address", "12445678876655");
        personRepo.update(person);

    }

    public void remove() {
        Map<String, Object> person = new HashMap<String, Object>();
        person.put("name", "alvinxu1");
        personRepo.remove(person);

    }
}
