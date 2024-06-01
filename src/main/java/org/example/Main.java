package org.example;

public class Main {
    private static final String finalna = new String("wsad") ;

    public static void main(String[] args) {

        Integer[] myArray = new Integer[1000 * 1000 * 1000];

        System.out.println("Hello world!");
        System.out.println(finalna.toString());
     //   finalna = finalna + "qwerty";
      //  System.out.println(finalna.toString());
        Dodawanie dodawanie = new Dodawanie();

        Aricraft aricraft = new Aricraft("wilga");
        Aricraft aricraft1 = new Aricraft("Jak");
        Glider glider = new Glider("puchacz");

        System.out.println(aricraft);
        System.out.println(aricraft1);
        aricraft1.ints[1] = 4;
        Aricraft aricraft2 = new Aricraft("cessna");

        System.out.println(aricraft1);
        System.out.println(aricraft);
        System.out.println(aricraft2);
        System.out.println(glider);
        aricraft1.fly();
        glider.fly();





    }
}