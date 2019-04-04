package com.greedystar.yogurt.gateway.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author GreedyStar
 * Date   2019-04-02
 */
public class CustomRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {
    @Value("#{${routes}}")
    private Map<String, String> map = new HashMap<>();

    public CustomRouteLocator(String servletPath, ZuulProperties properties) {
        super(servletPath, properties);
    }

    @Override
    protected Map<String, ZuulProperties.ZuulRoute> locateRoutes() {
        LinkedHashMap<String, ZuulProperties.ZuulRoute> routesMap = new LinkedHashMap();
        routesMap.putAll(super.locateRoutes());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            routesMap.put(entry.getValue(), new ZuulProperties.ZuulRoute(entry.getKey(), entry.getValue(), entry.getKey(), null, false
                    , true, null));
        }
        return routesMap;
    }

    @Override
    public void refresh() {
        doRefresh();
    }
}
