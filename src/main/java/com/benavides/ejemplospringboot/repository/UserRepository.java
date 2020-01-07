package com.benavides.ejemplospringboot.repository;

import com.benavides.ejemplospringboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllByName(String name);

}
