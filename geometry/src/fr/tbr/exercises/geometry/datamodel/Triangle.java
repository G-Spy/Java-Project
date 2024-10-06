package fr.tbr.exercises.geometry.datamodel;

public class Triangle {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    public double getPerimeter() {
        return  this.sideA + this.sideB + this.base;
    }
}
