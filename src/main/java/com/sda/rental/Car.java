package com.sda.rental;

public class Car {
    private String make;
    private String model;
    private String plate;
    private int year;
    private int mileage;

    public Car(String make, String model, String plate) {
        this.make = make;
        this.model = model;
        this.plate = plate;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getPlate() {
        return plate;
    }

    public int getMileage() {
        return mileage;
    }

    public boolean equals(Object object){   //Override klasy Object, który pozwoli na porównanie obiektów car
        Car car = (Car) object;
        if (car.make.equals(this.make) && car.model.equals(this.model) && car.plate.equals(this.plate)){
            return true;
        }
        return false;
    }
}
