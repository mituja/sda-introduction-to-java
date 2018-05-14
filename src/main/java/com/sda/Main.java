package com.sda;

public class Main {
    public static void main(String[] args){
        System.out.println("rozmiar: " + args.length);

        for(String arg : args){
            System.out.println(arg);
        }
    }
}
