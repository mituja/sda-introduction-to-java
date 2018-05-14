package com.sda.pholimorphism;

public class Vehicle {

    private int speed = 0;

    public void accelerate() {
        speed++;
    }

    public void stop() {
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

}
