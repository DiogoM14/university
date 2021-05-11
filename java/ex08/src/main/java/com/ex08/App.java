package com.ex08;

import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
        Carro[] cars = new Carro[3];

        cars[0] = new Carro("Megane", "Renault", "35-AO-15");
        cars[1] = new Carro("Corsa", "Opel", "54-43-HU");
        cars[2] = new Carro("Clio", "Renault", "12-12-FF");

        System.out.println(BinarySearch.linearSearch(cars, 0, cars.length, new Carro("AWEF", "PhAFWelps", "322-555-2284")));

        for (int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }
}
