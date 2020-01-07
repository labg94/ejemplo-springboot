package com.benavides.ejemplospringboot.service;

import com.benavides.ejemplospringboot.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> showAll();

    List<User> findByName(String name);

    boolean deleteUser(String id);
}
