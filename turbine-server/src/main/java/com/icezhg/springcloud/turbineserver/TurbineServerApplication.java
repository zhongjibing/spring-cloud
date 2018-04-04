package com.icezhg.springcloud.turbineserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@EnableHystrix
@EnableTurbine
@SpringBootApplication
public class TurbineServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineServerApplication.class, args);
    }
}
