package com.fred.service;

import com.fred.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nimtego_loc on 19.08.2017.
 */
@Service
public class UserServiceImpl implements UserService {
    private long id = 0;
    private Map<Long, User> users = new HashMap<>();

    @Override
    public User saveUser(User user) {
        user.setUserId(id++);
        users.put(user.getUserId(),user);
        return user;
    }

    @Override
    public User getUser(long userId) {
        return users.get(userId);
    }

    @Override
    public User deleteUser(long userId) {
        return users.remove(userId);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public List<User> getUsers(String firstName) {
        return null;
    }

    public void setUsers(Map<Long, User> users) {
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
