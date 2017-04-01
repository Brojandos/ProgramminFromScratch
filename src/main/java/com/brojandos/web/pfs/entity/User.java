package com.brojandos.web.pfs.entity;

import com.brojandos.web.pfs.common.Constants;

/**
 * @author: Brojandos
 * @creation_date: Mar 16, 2017
 */
public class User extends BaseEntity {
    private String password;

    public User() {}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate() {
        return password.equals(Constants.GLOBAL_PASSWORD);
    }
}
