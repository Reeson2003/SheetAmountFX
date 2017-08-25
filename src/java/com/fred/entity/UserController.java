package com.fred.entity;

import com.fred.exception.ErrorMessageException;
import com.fred.service.ServiceLocator;
import com.fred.service.UserService;

/**
 * Created by myasnikov
 * on 25.08.2017.
 */
public class UserController {
    public static Long logInUser(String logIn, String password) throws ErrorMessageException {
        if (logIn.isEmpty() || password.isEmpty()) {
            throw new ErrorMessageException(logIn.isEmpty() ? "Login empty" : "Password empty");
        }
        UserService userService = ServiceLocator.getUserService();
        return userService.getUserId(logIn, password);
    }

    public static boolean singUpUser(String logIn, String password) throws ErrorMessageException {
        if (logIn.isEmpty() || password.isEmpty()) {
            throw new ErrorMessageException(logIn.isEmpty() ? "Login empty" : "Password empty");
        }
        UserService userService = ServiceLocator.getUserService();
        User user = new User();
        user.setLogData(new LogData(logIn, password));
        System.out.println(userService != null);
        userService.saveUser(user);
        return true;
    }
}
