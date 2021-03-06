package com.example.PartieBack.Service;

import com.example.PartieBack.entities.User;

import java.util.List;

public interface UserService {
    User SaveUser(User u);

    List<User> getAllUsers();

    User updateUser (User  U);

    void deleteUser(User U);

    void deleteUserById(Long id);

    User getUser(Long id);
}
