package com.sda.rental;


public class EqualsMain {
    public static void main (String[] args){
        Car bmw = new Car("bmw", "model", "PO");
        Car otherBmw = new Car("bmw", "model", "PO");

        if (bmw==otherBmw){
            System.out.println("takie same");
        } else System.out.println("inne");

        if (bmw.equals(otherBmw)){
            System.out.println("takie same");
        } else System.out.println("inne");
    }
}
