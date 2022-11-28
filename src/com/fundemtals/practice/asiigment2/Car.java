package com.fundemtals.practice.asiigment2;

public class Car extends Vehicle {
    private int wheelsNumber;
    private boolean isFourWheelDrive;

    public Car(String serialNumber, String seriesName, double cost, String color, int warrantyMonth, int maxSpeed,
               int wheelsNumber, boolean isFourWheelDrive) {
        super(serialNumber, seriesName, cost, color, warrantyMonth, maxSpeed); // it call Vehicle "full" constructor
        this.wheelsNumber = wheelsNumber;
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public Car(int wheelsnumber, boolean isfourwheeldrive) {
        super();
        this.wheelsNumber = wheelsnumber;
        this.isFourWheelDrive = isfourwheeldrive;
    }

    public Car(){

    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }


}
