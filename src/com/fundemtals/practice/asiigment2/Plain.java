package com.fundemtals.practice.asiigment2;

public class Plain extends Vehicle {
    private int	availableSeats;
    private int crewNumber;

    public Plain(String serialNumber, String seriesName, double cost, String color, int warrantyMonth, int maxSpeed, int availableSeats, int crewNumber) {
        super(serialNumber, seriesName, cost, color, warrantyMonth, maxSpeed);
        this.availableSeats = availableSeats;
        this.crewNumber = crewNumber;
    }

    public Plain() {
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getCrewNumber() {
        return crewNumber;
    }

    public void setCrewNumber(int crewNumber) {
        this.crewNumber = crewNumber;
    }
}
