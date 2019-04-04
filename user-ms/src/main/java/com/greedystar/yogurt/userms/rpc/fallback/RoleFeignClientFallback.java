package com.greedystar.yogurt.userms.rpc.fallback;

import com.greedystar.yogurt.userms.entity.Role;
import com.greedystar.yogurt.userms.rpc.RoleFeignClient;
import org.springframework.stereotype.Component;

/**
 * Author GreedyStar
 * Date   2019-04-03
 */
@Component
public class RoleFeignClientFallback implements RoleFeignClient {
    @Override
    public Object list() {
        return "list:Service Unavailable";
    }

    @Override
    public String insert(Role role) {
        return "insert:Service Unavailable";
    }
}
