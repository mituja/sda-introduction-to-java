package com.sda.variables;

public class Main3 {
    private static final int DIRECTORY_VAR_INDEX = 0;

    public static void main(String[] args){
        String directoryToListen = args[DIRECTORY_VAR_INDEX];

        String [] names = new String[] {"gfh", "fghj", "fgh"};
        StringBuilder builder = new StringBuilder();
        for (String name : names){
            builder.append(name).append(", ");
        }
        System.out.println(builder.toString());

        String a = "a";
        String b = "b";

        if(a.equals(b))
            System.out.println("tak");
        else System.out.println("nie");
    }
}
