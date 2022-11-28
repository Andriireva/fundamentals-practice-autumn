package com.fundemtals.practice.asiigment2;


public abstract class Vehicle {
    protected String serialNumber;
    protected String seriesName;
    protected double cost; // primitive wrapper (full class) // default is 0.0
    protected String color;
    protected int warrantyMonth;
    protected int maxSpeed;

    public Vehicle(String serialNumber, String seriesName, double cost, String color, int warrantyMonth, int maxSpeed) {
        this.serialNumber = serialNumber;
        this.seriesName = seriesName;
        this.cost = cost;
        this.color = color;
        this.warrantyMonth = warrantyMonth;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle() {
    }

    // public String getSerialnum() {
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWarrantyMonth() {
        return warrantyMonth;
    }

    public void setWarrantyMonth(int warrantyMonth) {
        this.warrantyMonth = warrantyMonth;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
