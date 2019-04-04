package com.greedystar.yogurt.gateway.config;

import com.greedystar.yogurt.gateway.common.CustomRouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author GreedyStar
 * Date   2019-04-02
 */
@Configuration
public class ZuulConfig {
    @Autowired
    private ServerProperties server;
    @Autowired
    private ZuulProperties zuulProperties;

    @Bean
    public RouteLocator routeLocator() {
        CustomRouteLocator routeLocator = new CustomRouteLocator(server.getServlet().getContextPath(), zuulProperties);
        return routeLocator;
    }

}
