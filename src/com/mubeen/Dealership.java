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

    public int search(String make, int budget){
        for (int index = 0; index < this.cars.length; index++) {

            if(this.cars[index] == null){
                continue;
            }
            else if((this.cars[index].getMake().equalsIgnoreCase(make))&&(this.cars[index].getPrice()<=budget)){
                System.out.println("\nWe found a car in spot "+ index +
                        "\n\n" +cars[index].toString() +  "\n" +
                        " If you're interested, type 'yes':");
                return index;
            }
        }
        return 404;
    }

    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String toString(){

        String temp = "";
        for (int index = 0; index <this.cars.length ; index++) {
            temp += "Parking spot: " + index + "\n";
            if(this.cars[index]==null){
                temp += "Empty.\n";
            }
            else{
                temp += this.cars[index].toString()+"\n";
            }
        }
        return temp;
    }
}
