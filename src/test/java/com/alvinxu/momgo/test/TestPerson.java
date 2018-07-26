package com.alvinxu.momgo.test;

import com.alvinxu.jpa.data.Person;
import com.alvinxu.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class TestPerson {
    @Autowired
    PersonService personService;

    @Test
    public void runPerson() {
        /*插入*/
        personService.insertBase();
        /*查找一个*/
        Person one = personService.findOne();
        System.out.println(one.getId() + "   " + one.getName());
        /*查找所有*/
        List<Person> all = personService.findAll();
        for (Person person : all) {
            System.out.println(person.getId() + " " + person.getName());
        }
        /*更新*/
        personService.update();
        /*删除*/
        personService.remove();
    }
}
