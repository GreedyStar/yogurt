package com.greedystar.yogurt.rolems;

import com.greedystar.yogurt.commondependency.common.ExcludeScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {ExcludeScan.class}))
public class RoleMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoleMsApplication.class, args);
    }

}
