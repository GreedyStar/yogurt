package com.greedystar.yogurt.rolems.service;

import com.greedystar.yogurt.rolems.entity.Role;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
public interface RoleService {

    public Role get(String id);

    public List<Role> findList(Role role);

    public List<Role> findAllList();

    public int insert(Role role);

    public int insertBatch(List<Role> roles);

    public int update(Role role);

    public int delete(Role role);

}
