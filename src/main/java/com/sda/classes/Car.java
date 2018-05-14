package com.sda.classes;


public class Car {
    private String make;
    private String model;
    private String plate;
    private int year;
    private int mileage;
    private static final int MIN_YEAR = 1900;
    private static final int[] SOME;

    public Car(String make, String model, String plate) {
        this.make = make;
        this.model = model;
        this.plate = plate;
    }

    static {
        SOME = new int[10];
        for (int i=0; i<10; i++){
            SOME[i] = i;
        }

    }

    public Car(String make, String model, String plate, int year, int mileage) {
        this(make, model, plate);
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public void setYear(int year) {
        if (year <= MIN_YEAR) {
            year = MIN_YEAR;
        }
        this.year = year;
// this.year = year < MIN_YEAR ? MIN_YEAR : year;
    }

    public void setMilage(int mileage) {
        if (mileage <= 0) {
            mileage = 0;
        }
        this.mileage = mileage;

    }
}
