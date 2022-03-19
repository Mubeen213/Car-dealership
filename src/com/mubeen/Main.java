package com.mubeen;

/*
 *** Requirements  ***
 * The dealership sells many types of cars.
 * A car is identified by its make,price,year and color
 * The dealership app should be able to search for cars based on make and price
 * After a sale, the car must drive to the nearest exit
 * Every car now has spare parts.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car nissan = new Car("Nissan",12000, 2000,"Red",new String[]{"Tires", "Brakes"});

        System.out.println(nissan);

    }
}
