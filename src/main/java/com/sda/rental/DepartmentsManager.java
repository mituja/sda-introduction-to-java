package com.sda.rental;

public class DepartmentsManager {
    public static final int MAX_DEPARTMENTS = 100;
    private Department[] departments = new Department[MAX_DEPARTMENTS];
    private int amount = 0;


    public void addDepartment(String name) {
        Department firstDep = new Department();
        departments[amount] = firstDep;
        amount++;

    }


    public Car getByPlate(String plate) {
        //TODO implement
        //TODO

        return null;
    }

    public Department findDepartmentByPlate(String plate) {
        for (Department department : departments) {//dla wszystkich oddziałów szukamy oddziału który spełnmia warunek if
            if (department.findByPlate(plate) != null)
                return department;
        }
        return null;
    }

    public void addCarToDepartment(String name, Car car) {
        //TODO implement
        //w petli for szukamy oddziału po nazwie, a jak znajdziemy to wywołujemy metodę dodaj samochód department d = new Department(), d.addCar


    }


}

