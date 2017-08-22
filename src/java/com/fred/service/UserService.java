package com.fred.service;

import com.fred.entity.User;

import java.util.List;

/**
 * Created by nimtego_loc on 19.08.2017.
 */
public interface UserService {
    User saveUser(User user);

    User getUser(long userId);

    User deleteUser(long userId);

    List<User> getUsers();

    List<User> getUsers(String firstName);
}
