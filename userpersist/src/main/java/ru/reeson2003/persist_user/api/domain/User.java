package ru.reeson2003.persist_user.api.domain;

import java.util.Date;

/**
 * Date: 25.08.2017.
 * Time: 23:01.
 *
 * @author Pavel Gavrilov.
 */
public class User {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;
    private String emeail;
    private String login;
    private String password;
    private Date registerdate;
    private Date updateDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmeail() {
        return emeail;
    }

    public void setEmeail(String emeail) {
        this.emeail = emeail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
