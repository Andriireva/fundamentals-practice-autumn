package com.fundemtals.practice.asiigment2;

public class Ship extends Vehicle {
    private double serviceCost;
    private int crewNumber;

    public Ship(String serialNumber, String seriesName, double cost, String color, int warrantyMonth, int maxSpeed, double serviceCost, int crewNumber) {
        super(serialNumber, seriesName, cost, color, warrantyMonth, maxSpeed);
        this.serviceCost = serviceCost;
        this.crewNumber = crewNumber;
    }

    public Ship() {
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getCrewNumber() {
        return crewNumber;
    }

    public void setCrewNumber(int crewNumber) {
        this.crewNumber = crewNumber;
    }
}
