package com.greedystar.yogurt.userms.entity;

import java.io.Serializable;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String code;
    private String name;

    public Role() {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}