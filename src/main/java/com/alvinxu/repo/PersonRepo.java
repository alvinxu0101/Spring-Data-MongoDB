package com.alvinxu.repo;

import com.alvinxu.jpa.data.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("personRepo")
public interface PersonRepo extends MongoRepository<Person, String>, PersonRepoTemp {

}
