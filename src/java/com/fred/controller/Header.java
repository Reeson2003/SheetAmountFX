package com.fred.controller;

import com.fred.entity.UserController;
import com.fred.entity.UserServicesStandard;
import com.fred.view.MainWindow;
import ru.reeson2003.persist_user.api.service.UserServices;

/**
 * Created by myasnikov
 * on 26.07.2017.
 */
public class Header {
    private UserServices userServices;
    private UserController userController;
    public Header() {
        this.userController = new UserController();
        this.userServices = new UserServicesStandard();
    }

    public UserServices getUserService() {
        return userServices;
    }
    public void running() {
        MainWindow.run();
    }
}
