package fr.tbr.exercises.geometry.datamodel;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }
    // Approach 2
    public class Circle implements Shape{

        private double radius;


        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculatePerimeter(){
            return 2 *  this.radius * Math.PI;
        }

        public double calculateArea(){
            return  Math.pow(this.radius,2)  * Math.PI;
        }
}
