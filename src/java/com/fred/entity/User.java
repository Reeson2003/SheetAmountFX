package com.fred.entity;

/**
 * Created by nimtego_loc on 19.08.2017.
 */
public class User {
    private long userId;
    private PersonalData personalData;
    private LogData logData;

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public LogData getLogData() {
        return logData;
    }

    public void setLogData(LogData logData) {
        this.logData = logData;
    }

}
