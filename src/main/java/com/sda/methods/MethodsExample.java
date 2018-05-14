package com.sda.methods;

public class MethodsExample {
    public static void main(String[] args) {
        printHello();
        print("witam");
        int sum = add(1,2);
        System.out.println(sum);

//        print(add());

    }

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void print (String text) {
        System.out.println(text);
    }

    public static void print (int a){
        System.out.println(a);
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
