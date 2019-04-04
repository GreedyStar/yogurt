package com.greedystar.yogurt.userms.service;

import com.greedystar.yogurt.userms.entity.User;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
public interface UserService {

    public User get(String id);

    public List<User> findList(User user);

    public List<User> findAllList();

    public int insert(User user);

    public int insertBatch(List<User> users);

    public int update(User user);

    public int delete(User user);

}
