package org.example;

import java.util.Arrays;
import java.util.Objects;

public  class Aircraft {
    static int count = 0;
    int id=1;





    private  String name;

    private String type;

    private int pasengers;

    final int[] ints = new int[2];

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return id == aircraft.id && pasengers == aircraft.pasengers && Objects.equals(name, aircraft.name) && Objects.equals(type, aircraft.type) && Arrays.equals(ints, aircraft.ints);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, type, pasengers);
        result = 31 * result + Arrays.hashCode(ints);
        return result;
    }

    public Aircraft(String name) {
        this.name = name;
        this.ints[0] = 1;
        this.ints[1] = 2;
       // id = count++;
    }
    public Aircraft(AircraftBuilder aircraftBuilder){
        this.id = aircraftBuilder.id;
        this.name=aircraftBuilder.name;
        this.type=aircraftBuilder.type;
        this.pasengers = aircraftBuilder.pasengers;
    }

    public Aircraft(String name, String type, int pasengers) {

        this.name = name;
        this.type = type;
        this.pasengers = pasengers;
    }

//    public Aircraft() {
//    }

    public void fly(){
        System.out.println(name + " leci");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getInts() {
        return ints;
    }

    @Override
    public String toString() {
        return "Aricraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pasengers=" + pasengers +
                ", ints=" + Arrays.toString(ints) +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class AircraftBuilder {
        private int id;

        private static int counter = 100;

        private  String name;

        private String type;

        private int pasengers;

        final int[] ints = new int[2];

        public AircraftBuilder id () {
            this.id = counter++;
            return this;
        }
        public AircraftBuilder name (String name) {
            this.name = name;
            return this;
        }
        public AircraftBuilder type (String type) {
            this.type = type;
            return this;
        }

        public AircraftBuilder pasengers (int pasengers) {
            this.pasengers = pasengers;
            return this;
        }
        public Aircraft build(){
            return new Aircraft(this);
        }





    }
}