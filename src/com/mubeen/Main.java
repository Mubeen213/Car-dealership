package com.mubeen;

/*
 *** Requirements  ***
 * The dealership sells many types of cars.
 * A car is identified by its make,price,year and color
 * The dealership app should be able to search for cars based on make and price
 * After a sale, the car must drive to the nearest exit
 * Every car now has spare parts.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car cars[] = new Car[]{
                new Car("Nissan",12000, 2000,"Red",new String[]{"Tires", "Brakes"}),
                new Car("BMW",100000, 2000,"Red",new String[]{"Tires", "Brakes"}),
                new Car("Audi",120000, 2000,"Red",new String[]{"Tires", "Brakes"}),
                new Car("Ferrari",1200000, 2000,"Red",new String[]{"Tires", "Brakes"}),
                new Car("Lamborghini",1100000, 2000,"Red",new String[]{"Tires", "Brakes"}),
                new Car("Swift",700000, 2000,"Red",new String[]{"Tires", "Brakes"}),
                new Car("Fortuner",480000, 2000,"Red",new String[]{"Tires", "Brakes"}),
        };
        Dealership dealership = new Dealership(cars);
        System.out.println("Welcome to Java dealership \n");
        System.out.println("Enter the type of car you are looking for : ");

        Scanner sc = new Scanner(System.in);
        String carName = sc.nextLine();

        System.out.println("Enter your budget: ");
        double budget = sc.nextInt();

        int index = dealership.search(carName,budget);

        switch (index){
            case 404:
                System.out.println("Feel free to browse our collection \n");
                System.out.println(dealership);
                break;

            default:
                sc.nextLine();
                String decision = sc.nextLine();
                if(decision.equalsIgnoreCase("yes")){
                    dealership.sell(index);
                }
                else{
                    System.out.println("Feel free to browse our collection \n");
                    System.out.println(dealership);
                }
                break;
        }

    }
}
