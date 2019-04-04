package com.greedystar.yogurt.userms.rpc.fallback;

import com.greedystar.yogurt.userms.entity.Role;
import com.greedystar.yogurt.userms.rpc.RoleFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Author GreedyStar
 * Date   2019-04-03
 */
@Component
public class RoleFeignClientFallbackFactory implements FallbackFactory<RoleFeignClient> {
    @Override
    public RoleFeignClient create(Throwable throwable) {
        RoleFeignClient roleFeignClient = new RoleFeignClient() {
            @Override
            public Object list() {
                return throwable.getMessage();
            }

            @Override
            public String insert(Role role) {
                return throwable.getMessage();
            }
        };
        return roleFeignClient;
    }
}
