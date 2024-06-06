package org.example;

public class Glider extends Aircraft {
    public Glider(String name) {
        super(name);

    }

//    public  Aircraft(String name){
//        super(name);
//    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("  leci ale cicho");
    }
    //    @Override
//     public void fly() {
//        super();
//        System.out.println(getName() + " leci cichutko");
//    }
}
