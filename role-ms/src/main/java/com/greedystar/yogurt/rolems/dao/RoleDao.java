package com.greedystar.yogurt.rolems.dao;

import com.greedystar.yogurt.rolems.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
@Mapper
public interface RoleDao {

    public Role get(String id);

    public List<Role> findList(Role role);

    public List<Role> findAllList();

    public int insert(Role role);

    public int insertBatch(List<Role> roles);

    public int update(Role role);

    public int delete(Role role);

}