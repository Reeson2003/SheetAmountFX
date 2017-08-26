package ru.reeson2003.persist_user.api.service;

import ru.reeson2003.persist_user.api.UserPersistException;
import ru.reeson2003.persist_user.api.domain.User;

import java.util.List;

/**
 * Date: 25.08.2017.
 * Time: 23:11.
 *
 * @author Pavel Gavrilov.
 */
public interface UserQuery {
    String FIRST_NAME = "firstName";
    String MIDDLE_NAME = "middleName";
    String LAST_NAME = "lastName";
    String BIRTH_DATE = "birthDate";
    String EMAIL = "emeail";
    String LOGIN = "login";
    String PASSWORD = "password";
    String REGISTER_DATE = "registerdate";
    String UPDATE_DATE = "updateDate";

    UserQuery firstName(String firstName);
    UserQuery firstNameLike(String pattern);
    UserQuery middleName(String middleName);
    UserQuery middleNameLike(String pattern);
    UserQuery lastName(String lastName);
    UserQuery lastNameLike(String pattern);
    UserQuery email(String email);
    UserQuery emailLike(String pattern);
    UserQuery login(String login);
    UserQuery loginLike(String pattern);
    UserQuery loggedIn(boolean loggedIn);
    UserQuery orderBy(String parameter);
    DateQuery birthDate();
    DateQuery registerDate();
    DateQuery updateDate();
    List<User> user() throws UserPersistException;
    User singleResult() throws UserPersistException;
}
