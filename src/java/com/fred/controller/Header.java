package com.fred.controller;

import com.fred.service.ServiceLocator;
import com.fred.service.UserService;
import com.fred.view.MainWindow;

/**
 * Created by myasnikov
 * on 26.07.2017.
 */
public class Header {
    private UserService userService;
    public Header() {
        this.userService = ServiceLocator.getUserService();
    }

    public void running() {
        MainWindow.run();
    }
}
