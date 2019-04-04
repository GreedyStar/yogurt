package com.greedystar.yogurt.userms.rpc;

import com.greedystar.yogurt.userms.entity.Role;
import com.greedystar.yogurt.userms.rpc.fallback.RoleFeignClientFallback;
import com.greedystar.yogurt.userms.rpc.fallback.RoleFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author GreedyStar
 * Date   2019-04-01
 */
@FeignClient(name = "role-ms", fallback = RoleFeignClientFallback.class)
public interface RoleFeignClient {

    @RequestMapping(value = {"/role/list"}, method = RequestMethod.GET)
    Object list();

    @RequestMapping(value = "/role/insert", method = RequestMethod.POST)
    String insert(@RequestBody Role role);

}
