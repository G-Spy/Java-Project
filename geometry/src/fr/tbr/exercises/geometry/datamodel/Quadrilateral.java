package fr.tbr.exercises.geometry.datamodel;

public class Quadrilateral {
    private double height;
    private double width;

    public Quadrilateral(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return this.height * this.width;
    }
    public double getPerimeter() {
        return 2*(this.height + this.width);
    }
}
