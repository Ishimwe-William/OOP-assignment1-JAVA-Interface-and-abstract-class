/**
 * 1.Create an abstract class 'Parent' with a method 'message'.
 * It has two subclasses each having a method with the same name
 * 'message' that prints "This is first subclass" and "This is second
 * subclass" respectively. Call the methods 'message' by creating an
 * object for each subclass.
 */
package abstracts.q1;

public class Q1 {
    public static void main(String[] args) {
        Parent obj1 = new Subclass1();
        Parent obj2 = new Subclass2();
        obj1.message();
        obj2.message();
    }
}
