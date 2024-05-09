/**
 * 5. Write a  program to create an interface Resizable with methods
 * resizeWidth(int width) and resizeHeight(int height) that allow an
 * object to be resized. Create a class Rectangle that implements the
 * Resizable interface and implements the resize methods.
 */

package intefaces.q5;

public class Q5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int newWidth = rectangle.resizeWidth(20);
        int newHeight = rectangle.resizeHeight(30);

        System.out.println("New width: " + newWidth + "\nNew height: " + newHeight);
    }
}
