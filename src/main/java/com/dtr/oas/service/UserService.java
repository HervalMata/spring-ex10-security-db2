package com.dtr.oas.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dtr.oas.dao.DuplicateUserException;
import com.dtr.oas.dao.UserNotFoundException;
import com.dtr.oas.model.User;

public interface UserService extends UserDetailsService {

    public void addUser(User user) throws DuplicateUserException;

    public User getUser(int userId) throws UserNotFoundException;

    public User getUser(String username) throws UserNotFoundException;

    public void updateUser(User user) throws UserNotFoundException;

    public void deleteUser(int userId) throws UserNotFoundException;

    public List<User> getUsers();
}
