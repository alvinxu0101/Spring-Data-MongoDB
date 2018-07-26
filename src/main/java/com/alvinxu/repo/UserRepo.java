package com.alvinxu.repo;

import com.alvinxu.jpa.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepo")
public interface UserRepo extends MongoRepository<User, String> {

}
