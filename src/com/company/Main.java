package com.company;


import dziedziczenie.Car;
import dziedziczenie.Vehicles;
import dziedziczenie.Engine;

public class Main {

    public static void main(String[] args) {
        Engine silnikDiesla = new Engine("Diesel", 1.9);
        //System.out.println(silnikDiesla.toString());

        Car BMW = new Car(new Engine("Benzyna", 2.0), 280,50);

        //System.out.println(BMW.toString());


    }
}
