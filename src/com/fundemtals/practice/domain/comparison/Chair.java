package com.fundemtals.practice.domain.comparison;

import com.fundemtals.practice.domain.Dog;

import java.util.Objects;

public class Chair implements Comparable<Chair> {
    private String color;
    private Double cost;

    private Dog dog;

    public Chair(String color, Double cost, Dog dog) {
        this.color = color;
        this.cost = cost;
        this.dog = dog;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCost() {
        return cost;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Chair obj1)) {
//            return false;
//        }
//        return ((color == null && obj1.color == null) || (color != null && color.equals(obj1.color)))
//                && cost.equals(obj1.cost);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Objects.equals(color, chair.color)
                && Objects.equals(cost, chair.cost)
                && Objects.equals(dog, chair.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, cost, dog);
    }

    @Override
    public int compareTo(Chair o) {
        return cost.compareTo(o.cost);
    }
}
