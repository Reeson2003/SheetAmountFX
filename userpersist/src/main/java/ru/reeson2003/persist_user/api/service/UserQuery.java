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

    UserQuery firstName();
    UserQuery middleName();
    UserQuery lastname();
    UserQuery orderBy(String parameter);
//    UserQuery birthdate();
//    UserQuery registerDate();
//    UserQuery updateDate();
    List<User> user() throws UserPersistException;
    User singleResult() throws UserPersistException;
}
