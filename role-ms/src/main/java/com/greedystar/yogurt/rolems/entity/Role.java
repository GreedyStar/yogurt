package com.greedystar.yogurt.rolems.entity;

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