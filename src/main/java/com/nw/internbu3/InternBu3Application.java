package com.nw.internbu3;

import com.nw.internbu3.SpringExercise.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.nw.internbu3")
public class InternBu3Application {
    public static void main(String[] args) {
//        SpringApplication.run(InternBu3Application.class, args);
        ApplicationContext context = SpringApplication.run(InternBu3Application.class, args);
        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.useVehicle();
    }
}
