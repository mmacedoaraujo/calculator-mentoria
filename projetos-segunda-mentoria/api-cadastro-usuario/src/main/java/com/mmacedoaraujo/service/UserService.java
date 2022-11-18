package com.mmacedoaraujo.service;

import com.mmacedoaraujo.domain.User;
import com.mmacedoaraujo.repository.UserRepository;
import com.mmacedoaraujo.service.exceptions.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        Optional<User> byId = userRepository.findById(id);
        return byId.orElseThrow(() -> new UserNotFoundException("Usuário não encontrado " + id));
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
