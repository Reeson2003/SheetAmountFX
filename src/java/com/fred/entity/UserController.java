package com.fred.entity;

import com.fred.exception.ErrorMessageException;
import ru.reeson2003.persist_user.api.UserPersistException;
import ru.reeson2003.persist_user.api.domain.User;
import ru.reeson2003.persist_user.api.service.UserServices;


/**
 * Created by myasnikov
 * on 25.08.2017.
 */
public class UserController {
    public Long logInUser(String logIn, String password) throws ErrorMessageException, UserPersistException {
        if (logIn.isEmpty() || password.isEmpty()) {
            throw new ErrorMessageException(logIn.isEmpty() ? "Login empty" : "Password empty");
        }
        UserServices.getService().findByLogin(logIn);
        return null;
    }

    public  boolean singUpUser(String logIn, String password) throws ErrorMessageException, UserPersistException {
        if (logIn.isEmpty() || password.isEmpty()) {
            throw new ErrorMessageException(logIn.isEmpty() ? "Login empty" : "Password empty");
        }
        UserServices.getService().findByLogin(logIn);
        User user = new User();
        user.setPassword(password);
        user.setLogin(logIn);
        UserServices.getService().addUser(user);

        return true;
    }
}
