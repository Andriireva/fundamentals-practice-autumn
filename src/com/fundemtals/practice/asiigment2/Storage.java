package com.fundemtals.practice.asiigment2;

// Add class Storage. Add main methods.
// Create an array of vehicles and add to it a few instances of EACH vehicle type
// Add method that will find the fastest car
public class Storage {

    public static void main(String[] args) {
        Car car1 = new Car("XXXX", "BMW", 10000.55d, "white", 36, 270, 4, true);
        Car car2 = new Car("YYY", "Porche", 20000.55d, "orange", 36, 250, 4, true);

        Ship ship1 = new Ship("HHHH", "GoodShip", 100000.55d, "white", 36, 55, 100.55, 20);
        Ship ship2 = new Ship("WWWW", "QQQQQ", 200000.55d, "grey", 36, 45, 100.55, 50);

        Plain plain1 = new Plain("777", "Boeing", 2000000.55d, "white", 36, 720, 180, 7);
        Plain plain2 = new Plain("320", "Aircraft", 2200000.55d, "white", 36, 750, 170, 7);

        Vehicle[] vehicles = {ship2, ship1, plain2, plain1};

        Car fastestCar = findFastestCar(vehicles);

        if (fastestCar != null) {
            System.out.println(fastestCar.getSeriesName() + " " + fastestCar.getMaxSpeed() );
        } else {
            System.out.println(" there is no any car in array");
        }
    }

    public static Car findFastestCar(Vehicle[] vehicles) {
        Car fastestCar = null; // without assiging to null it is only declaration
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Car) {
                if (fastestCar == null || fastestCar.getMaxSpeed() < vehicles[i].getMaxSpeed()) {
                    fastestCar = (Car)vehicles[i];
                }
            }
        }
        return fastestCar;
    }


}
