package com.mubeen;

public class Dealership {

    private Car cars[];

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        for (int index = 0; index < cars.length ; index++) {
            this.cars[index] = new Car(cars[index]);
        }
    }

    public void setCar(Car car, int index) {
        this.cars[index] =new Car(car);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }
}
