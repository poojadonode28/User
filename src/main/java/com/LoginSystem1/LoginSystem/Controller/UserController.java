package com.LoginSystem1.LoginSystem.Controller;


import com.LoginSystem1.LoginSystem.Entity.User;
import com.LoginSystem1.LoginSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static java.sql.Types.NULL;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    private Optional<User> checkUserExists(@PathVariable int id) {
        return userService.findUserExists(id);
    }


    @GetMapping("/user/{token}")
    public ResponseEntity<String> login(@PathVariable String token) {
        Optional<User> user  = userService.findUserByToken(token);
        return new ResponseEntity<>("SUCESS", HttpStatus.OK);
        }

    }

