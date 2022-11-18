package com.mmacedoaraujo.service;

import com.mmacedoaraujo.domain.User;
import com.mmacedoaraujo.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
