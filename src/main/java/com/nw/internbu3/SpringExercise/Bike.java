package com.nw.internbu3.SpringExercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}