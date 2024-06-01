package org.example;

import jdk.jfr.Label;

public class Glider extends Aricraft {
    public Glider(String name) {
        super(name);

    }

    @Override
    public void fly() {
        super.fly();
        System.out.print(" cicho");
    }
    //    @Override
//     public void fly() {
//        super();
//        System.out.println(getName() + " leci cichutko");
//    }
}
