package com.ntuc.income.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public Long createUser(@RequestBody User user){
        user = userRepository.save(user);
        return user.getId();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findById(id).get();
    }
}
