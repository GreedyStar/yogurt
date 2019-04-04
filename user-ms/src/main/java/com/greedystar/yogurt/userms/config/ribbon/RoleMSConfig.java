package com.greedystar.yogurt.userms.config.ribbon;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Author GreedyStar
 * Date   2019-04-01
 */
@Configuration
@RibbonClient(name = "role-ms", configuration = RibbonConfig.class)
public class RoleMSConfig {

}
