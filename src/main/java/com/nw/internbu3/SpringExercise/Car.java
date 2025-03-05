package com.nw.internbu3.SpringExercise;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}
