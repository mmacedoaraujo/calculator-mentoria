package com.mmacedoaraujo.controller;

import com.mmacedoaraujo.domain.User;
import com.mmacedoaraujo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> returnAllUsersRegistered() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> returnAnUserById(@PathVariable Long id) {
        User userFound = userService.getUserById(id);
        return new ResponseEntity<>(userFound, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> registerNewUser(@RequestBody User user) {
        User userSaved = userService.save(user);

        return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
    }
}
