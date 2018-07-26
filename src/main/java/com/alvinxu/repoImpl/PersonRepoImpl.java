package com.alvinxu.repoImpl;

import com.alvinxu.jpa.data.Person;
import com.alvinxu.repo.PersonRepoTemp;
import com.mongodb.client.result.UpdateResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class PersonRepoImpl implements PersonRepoTemp {
    @Resource
    private MongoTemplate mongoTemplate;

    public void insertBase(Person object) {
        mongoTemplate.insert(object);
    }

    public Person findOne(Map<String, Object> parm) {
        Query query = new Query(Criteria.where("name").is(parm.get("name")));
        Person person = mongoTemplate.findOne(query, Person.class);
        return person;
    }

    public List<Person> findAll(Map<String, Object> parm) {
        List<Person> persons =
                mongoTemplate.find(new Query(Criteria.where("age").lt(parm.get("age"))), Person.class);
        return persons;
    }

    public void update(Map<String, Object> parm) {
        UpdateResult upsert = mongoTemplate.upsert(
                new Query(Criteria.where("name").is(parm.get("name"))),
                new Update().set("address", parm.get("name")), Person.class);
    }

    public void remove(Map<String, Object> parm) {
        mongoTemplate.remove(new Query(Criteria.where("name").is(parm.get("name"))), Person.class);

    }
}
