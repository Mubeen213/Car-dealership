package com.mubeen;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts,parts.length);
    }

    public Car(Car car){
        this.make = car.make;
        this.price = car.price;
        this.year = car.year;
        this.color = car.color;
        this.parts = Arrays.copyOf(car.parts,car.parts.length);
    }

    //********* Getters  ***************
    public String getMake(){
        return this.make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts,this.parts.length);
    }

    // ************ Setters *****************
    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts,parts.length);
    }

    // ********** Functions   ************** //

    public void drive(){
        System.out.println("You bought a beautiful " + this.make + " "
        + this.color + " car of model " + this.year);
    }

    public String toString(){
        return "Make: "+this.make +".\n"
                +"Price: " + this.price + ".\n"
                +"Year: "  + this.year + ".\n"
                +"Color: " + this.color + ".\n"
                +"Parts: " + Arrays.toString(this.parts)+".\n\n";
    }
}
