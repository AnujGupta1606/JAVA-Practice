package Poly2;

import Poly2.Shape.Circle;
import Poly2.Shape.Rectangle;
import Poly2.Shape.Triangle;

public class Scrt {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(5, 9);
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}
