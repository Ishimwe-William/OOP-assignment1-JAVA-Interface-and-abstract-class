/**
 * 6. Write a  program to create an interface Drawable with a method draw()
 * that takes no arguments and returns void. Create three classes Circle,
 * Rectangle, and Triangle that implement the Drawable interface and override
 * the draw() method to draw their respective shapes.
 */

package intefaces.q6;


public class Q6 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}

