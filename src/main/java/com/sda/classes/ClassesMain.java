package com.sda.classes;

public class ClassesMain {
    public static void main(String[] args){
        User jan = new User("453456767", "jan", "kowalski");
        User gosia = new User("34567");
        jan.setAge(10);
        gosia.setAge(-3);

        System.out.println("Pesel jana" + jan.getPesel());
        System.out.println("Pesel gosi" + gosia.getPesel());

        MathOperations.add(1, 1);

    }
}
