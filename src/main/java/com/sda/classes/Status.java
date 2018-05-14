package com.sda.classes;

public enum Status {
    DISABLED("disabled, user is disabled"),                   // obiekty zawsze na początku
    INACTIVE("inactive, user is inactive"),                   // to samo co DISABLED = new Status()
    ENABLED("enabled, user is enabled"),                    // konstruktory są domyślne, np new SUSPENDED()
    SUSPENDED("suspended, user is suspended");

    private String name;        // reszta kodu już normalnie
    private String message;

    Status(String name) {
        this.name = name;
        this.message = message;
    }


    public static Status getStatus(String name) {       // ta metoda ma być statyczna
        for (Status status : Status.values()) {         // values zwróci tablicę z 4 obiektami, disabled, inactive, itd
            if (status.name == name)
                return status;
        }
        return null;            //jeśli nie wykona się if, to zwróci się ten return, bo metoda musi coś zrówcić
    }


}
