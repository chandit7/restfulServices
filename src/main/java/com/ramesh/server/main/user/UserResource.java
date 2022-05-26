package com.ramesh.server.main.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;
    @GetMapping("/users")
    public List<User> retrieveAllusers(){
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public User retriveUser(@PathVariable int id)
    {
        return service.findOne(id);
    }

    //Add a new user
    @PostMapping("/users")
    public void addUser(@RequestBody User user){
       User savedUser = service.save(user);

    }

}

