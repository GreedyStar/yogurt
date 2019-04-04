package com.greedystar.yogurt.rolems.service.impl;

import com.greedystar.yogurt.rolems.dao.RoleDao;
import com.greedystar.yogurt.rolems.entity.Role;
import com.greedystar.yogurt.rolems.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    
    @Override
    public Role get(String id){
        return roleDao.get(id);
    }
    
    @Override
    public List<Role> findList(Role role) {
        return roleDao.findList(role);
    }
    
    @Override
    public List<Role> findAllList() {
        return roleDao.findAllList();
    }
    
    @Override
    public int insert(Role role) {
        return roleDao.insert(role);
    }
    
    @Override
    public int insertBatch(List<Role> roles){
        return roleDao.insertBatch(roles);
    }
    
    @Override
    public int update(Role role) {
        return roleDao.update(role);
    }
    
    @Override
    public int delete(Role role) {
        return roleDao.delete(role);
    }

}
