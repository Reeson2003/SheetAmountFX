package com.fred.entity;

/**
 * Created by nimtego_loc on 21.08.2017.
 */
public class LogData {
    private String logIn;
    private String password;

    public LogData(String logIn, String password) {
        this.logIn = logIn;
        this.password = password;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
