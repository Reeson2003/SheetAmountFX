package ru.reeson2003.persist_user.api.service;

/**
 * Date: 26.08.2017.
 * Time: 11:59.
 *
 * @author Pavel Gavrilov.
 */
public abstract class UserServices {
    private static UserService service;

    public static UserService getService() {
        return service;
    }

    protected void  setService(UserService service) {
        UserServices.service = service;
    }
}
