package com.sda.rental;

public class Department {
    public static final int MAX_CARS_AMOUNT = 100;
    private int amount = 0;                             //poki co w tablicy jest 0 aut
    private Car[] cars = new Car[MAX_CARS_AMOUNT];
    private String name;

    public int getAmount() {
        return amount;
    }

    public Car addCar(Car car) {      //Stworzenie obiektu zgodnego z klasa Car czyli dodajemy nowy samochod
        cars[amount] = car;           //Przypisanie obiektu do tablicy
        amount++;
        return car;                    //Może zwrócić voida, ale lepiej żeby zwróciła to co przyjęła - car
    }

    public Car addCar(String make, String model, String plate) {    //Jest przeciążenie, można stworzyć samochód zgodnie z parametrami klasy - powyżej - lub wg tych parametrów

        return addCar(new Car(make, model, plate));
    }

    public Car findByPlate(String plate) {
        for (Car car : cars) {
            if (car != null && car.getPlate() == plate)  //nie da się pobrać geterem jakiejś informacji gdy pytamy o obiekt null, czyli np miejsce w tablicy na którym jeszcze nie ma samochodu
                return car;
        }
        return null;
    }

    public void removeCar(String plate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getPlate() == plate) { //w mainie trzeba by pobrać plate żeby wiedzieć jakiego auta szukać
                cars[i] = null;
                amount--;
            }
        }
    }


    public String getName() {
        return name;
    }





}
