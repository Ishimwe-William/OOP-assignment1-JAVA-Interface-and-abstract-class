/**
 * 1. Write a  program to create an interface Shape with the getArea() method.
 * Create three classes Rectangle, Circle, and Triangle that implement the Shape
 * interface. Implement the getArea() method for each of the three classes.
 */


package intefaces.q1;

public class Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
