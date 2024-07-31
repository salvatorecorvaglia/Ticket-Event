package com.ticket.services;

import com.ticket.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
