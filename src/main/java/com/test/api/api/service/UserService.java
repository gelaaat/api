package com.test.api.api.service;

import com.test.api.api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface UserService {

    List<User> getAllUsers();
    Optional<User> findById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
