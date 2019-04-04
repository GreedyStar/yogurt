package com.greedystar.yogurt.userms.web;

import com.greedystar.yogurt.userms.entity.Role;
import com.greedystar.yogurt.userms.entity.User;
import com.greedystar.yogurt.userms.rpc.RoleFeignClient;
import com.greedystar.yogurt.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-03-29
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleFeignClient roleFeignClient;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    public Object list() {
        List<User> users = userService.findAllList();
        return users;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        User user = userService.get(id);
        return user;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody User user) {
        if (userService.insert(user) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<User> users) {
        if (userService.insertBatch(users) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody User user) {
        if (userService.update(user) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody User user) {
        if (userService.delete(user) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    /**
     * 访问role-ms微服务，获取角色列表
     * @return 角色列表
     */
    @RequestMapping(value = {"/role/list"}, method = RequestMethod.GET)
    public Object roleList() {
        return roleFeignClient.list();
    }

    /**
     * 访问role-ms微服务，保存角色数据
     * @param role 待保存的角色数据
     * @return 数据保存结果
     */
    @RequestMapping(value = {"/role/insert"}, method = RequestMethod.POST)
    public Object roleInsert(@RequestBody Role role) {
        return roleFeignClient.insert(role);
    }

}
