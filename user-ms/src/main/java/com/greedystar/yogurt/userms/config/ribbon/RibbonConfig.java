package com.greedystar.yogurt.userms.config.ribbon;

import com.greedystar.yogurt.commondependency.common.ExcludeScan;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author GreedyStar
 * Date   2019-04-01
 */
@Configuration
@ExcludeScan
public class RibbonConfig {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule(); // 负载均衡规则改为随机
    }

}
