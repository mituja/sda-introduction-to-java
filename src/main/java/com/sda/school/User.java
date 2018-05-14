package com.sda.school;

public class User {
    private String name;
    private String surname;
    private String pesel;
    private int age;

//    public boolean equals(Object o){
//        User u = (User) o;
//        return name.equals(u.name) && surname.equals(u.surname) && pesel.equals(u.pesel) && age == u.age;
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        return pesel.equals(user.pesel);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + pesel.hashCode();
        result = 31 * result + age;
        return result;
    }
}
