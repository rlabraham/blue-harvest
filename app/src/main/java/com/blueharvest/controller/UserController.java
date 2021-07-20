package com.blueharvest.controller;

import com.blueharvest.model.User;
import com.blueharvest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAll(){
        return userRepository.findAll();
    }
}
