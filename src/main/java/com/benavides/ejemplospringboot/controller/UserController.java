package com.benavides.ejemplospringboot.controller;

import com.benavides.ejemplospringboot.model.User;
import com.benavides.ejemplospringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {


    private final UserService userService;


    @PostMapping
    public User save(@RequestBody User user) {


        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.showAll();
    }


    @GetMapping("listByName")
    public List<User> findByName(@RequestParam String name) {
        return userService.findByName(name);
    }

    @DeleteMapping
    public String deleteById(@RequestParam String id) {


        return userService.deleteUser(id) ? "Deleted" : "User does not exist";
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}


