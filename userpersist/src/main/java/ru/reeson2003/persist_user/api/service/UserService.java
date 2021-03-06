package ru.reeson2003.persist_user.api.service;

import ru.reeson2003.persist_user.api.UserPersistException;
import ru.reeson2003.persist_user.api.domain.User;

import java.util.List;

/**
 * Date: 25.08.2017.
 * Time: 23:05.
 *
 * @author Pavel Gavrilov.
 */
public interface UserService {

    void addUser(User user) throws UserPersistException;

    User getUser(long userId) throws UserPersistException;

    void updateUser(User user) throws UserPersistException;

    void deleteUser(long id) throws UserPersistException;

    User findByLogin(String login) throws UserPersistException;

    List<User> getUsers() throws UserPersistException;

    UserQuery createUserQuery();
}
