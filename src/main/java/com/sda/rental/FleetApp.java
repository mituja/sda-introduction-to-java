package com.sda.rental;

import java.util.Scanner;

public class FleetApp {
    public static void main(String[] args) {
        DepartmentsManager manager = new DepartmentsManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwe oddziału: ");
        String name = sc.nextLine();
        manager.addDepartment(name);

        System.out.println("Podaj który samochod znalezc: ");
        String plate = sc.nextLine();
        Department departmentByPlate = manager.findDepartmentByPlate(plate);
        System.out.println(departmentByPlate.getName());
    }


//    ///niezwiązane
//
//    public void printNames(String... names) {
//        System.out.println(names[1]);
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
//
//    public void test() {
//        printNames();
//        printNames("dfgh");
//        printNames("dfgh", "fghjk");
//        printNames("sdfdfgh", "fghfdsajk", "fghjk");
//
//    }
}


