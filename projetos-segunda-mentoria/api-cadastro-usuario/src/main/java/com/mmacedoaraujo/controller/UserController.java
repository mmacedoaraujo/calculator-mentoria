package com.mmacedoaraujo.controller;

import com.mmacedoaraujo.domain.User;
import com.mmacedoaraujo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public ResponseEntity<List<User>> returnAllUsersRegistered() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
