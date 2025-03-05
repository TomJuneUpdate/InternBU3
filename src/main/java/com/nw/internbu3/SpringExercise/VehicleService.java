package com.nw.internbu3.SpringExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final Vehicle vehicle;

    @Autowired
    public VehicleService(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void useVehicle() {
        vehicle.start();
        vehicle.stop();
    }

}