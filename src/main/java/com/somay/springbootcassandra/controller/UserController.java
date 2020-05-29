package com.somay.springbootcassandra.controller;

import com.somay.springbootcassandra.model.User;
import com.somay.springbootcassandra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public  void saveUser(){
        List<User> users=new ArrayList<>();
        users.add(new User(64337,"Samay","Bangalore",50));
        users.add(new User(64387,"salil","mumbai",20));
        userRepository.saveAll(users);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
     return userRepository.findAll();

    }


}
