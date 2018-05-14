package com.sda.pholimorphism;

public class PoliMain {
    public static void main(String[] args) {
        Car c = new Car();
        Truck t = new Truck();
        Vehicle c2 = new Car();

        c.accelerate();
        t.accelerate();
        c.stop();
        t.stop();

        c.getTrunkSize();
        //c2.getTrunkSize();        nie da się tak!

        printSpeed(c);
        printSpeed(t);
        printSpeed(c2);
    }


    public static void printSpeed(Vehicle c) {
        if (c instanceof Car) { //bezpieczne rzutowanie na samochod
            Car otherCar = (Car) c;
            System.out.println("auto z bagaznikiem " + otherCar.getTrunkSize());
        }

        if (c instanceof Truck) {
            System.out.println("truck");
        }

        System.out.println(c.getSpeed());
    }
}
