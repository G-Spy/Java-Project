package fr.tbr.exercises.geometry.launcher;

import fr.tbr.exercises.geometry.datamodel.Circle;
import fr.tbr.exercises.geometry.datamodel.Quadrilateral;
import fr.tbr.exercises.geometry.datamodel.Square;
import fr.tbr.exercises.geometry.datamodel.Triangle;

import java.util.ArrayList;
import java.util.List;


public class Launcher {
    public static void main(String[] args) {
        Triangle triangle = new Triangle( 12, 15, 11, 16);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        Circle circle = new Circle( 10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Quadrilateral quadrilateral = new Quadrilateral( 12, 15);
        System.out.println(quadrilateral.getArea());
        System.out.println(quadrilateral.getPerimeter());
        Square square = new Square( 10);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


        List<Triangle> triangles = new ArrayList<Triangle>();
        double kdor = 0;
        for (int i = 0; i < 1000000; i++) {
            Triangle myTriangle = new Triangle( 1+i, 2+i, 3+i, 4+i);
            triangles.add(myTriangle);
            kdor = kdor + myTriangle.getArea();
        }
        System.out.println(kdor);

        List<Circle> circles = new ArrayList<Circle>();
        double kdouy = 0;
        for (int i = 0; i < 100000; i++) {
            Circle myCircle = new Circle( 1+i);
            circles.add(myCircle);
            kdouy = kdouy + myCircle.getArea();
        }
        System.out.println(kdouy);


        List<Square> squares = new ArrayList<Square>();
        double kdet = 0;
        for (int i = 0; i < 100000; i++) {
            Square mySquare = new Square( 1+i);
            squares.add(mySquare);
            kdet = kdet + mySquare.getArea();
        }
        System.out.println(kdet);
    }

}
