package com.greedystar.yogurt.userms.entity;

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String code;
    private String username;
    private String password;

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}