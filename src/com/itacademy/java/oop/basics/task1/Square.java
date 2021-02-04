package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + side +
                " perimeter=" + calculatePerimeter() +
                " area=" + calculateArea() +
                '}';
    }

}
