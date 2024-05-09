package abstracts.q6;

class Area extends Shape {
    void RectangleArea(double length, double width) {
        System.out.println("Area of rectangle: " + (length * width));
    }
    void SquareArea(double side) {
        System.out.println("Area of square: " + (side * side));
    }

    void CircleArea(double radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}
