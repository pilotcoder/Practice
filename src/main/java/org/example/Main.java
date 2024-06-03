package org.example;

import java.util.Collection;

public class Main {
    private static final String finalna = new String("finalny obiekt");

    public static void main(String[] args) {

        Integer[] myArray = new Integer[1000 * 1000 * 1000];

        System.out.println("Hello world!");
        System.out.println(finalna.toString());
        //   finalna = finalna + "qwerty";
        //  System.out.println(finalna.toString());
        Dodawanie dodawanie = new Dodawanie();

        Aircraft aircraft = new Aircraft("wilga");

      //  aircraft.setType("pzl-104");
        Aircraft aircraft1 = new Aircraft("wilga");
        Glider glider = new Glider("puchacz");
        Aircraft aircraftBuilded = new Aircraft.AircraftBuilder().name("gawron").type("PZL-101").pasengers(4).id().build();
        Aircraft aircraftBuilded2 = new Aircraft.AircraftBuilder()
                .name("Antek")
                .type("AN-2").pasengers(14)
                .id()
                .build();

        System.out.println(aircraft.equals(aircraft1));
        System.out.println(aircraft);
        System.out.println(aircraft1);
        aircraft1.ints[1] = 4;
        System.out.println(aircraft1 + "Zmieniona wartość w tabeli finalnej");
        aircraft1.fly();
        glider.fly();
        System.out.println(".");
        System.out.println(aircraftBuilded);
        System.out.println(aircraftBuilded2);

        Object object = new Object();
        object.getClass();

        String link1 = new String("https://teams.microsoft.com/l/meetup-join/19%3ameeting_YmY0Y2M1NWQtZmM3Ny00YTc2LWE2YTMtN2FjNDdjNWJlZTYw%40thread.v2/0?context=%7b%22Tid%22%3a%225b973f99-77df-4beb-b27d-aa0c70b8482c%22%2c%22Oid%22%3a%22a328bc20-0b20-4278-8d17-3f9efd91d163%22%7d");
        String link2 = new String("https://teams.microsoft.com/l/meetup-join/19%3ameeting_YmY0Y2M1NWQtZmM3Ny00YTc2LWE2YTMtN2FjNDdjNWJlZTYw%40thread.v2/0?context=%7b%22Tid%22%3a%225b973f99-77df-4beb-b27d-aa0c70b8482c%22%2c%22Oid%22%3a%22a328bc20-0b20-4278-8d17-3f9efd91d163%22%7d");

        System.out.println(link1.equals(link2));



    }
}