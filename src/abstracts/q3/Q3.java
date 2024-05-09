/**
 * We have to calculate the percentage of marks obtained in three
 * subjects (each out of 100) by student A and in four subjects (each out of 100)
 * by student B. Create an abstract class 'Marks' with an abstract
 * method 'getPercentage'. It is inherited by two other classes 'A' and 'B'
 * each having a method with the same name which returns the percentage of
 * the students. The constructor of student A takes the marks in three
 * subjects as its parameters and the marks in four subjects as its
 * parameters for student B. Create an object for eac of the two
 * classes and print the percentage of marks for both the students.
 */

package abstracts.q3;

public class Q3 {
    public static void main(String[] args) {
        A studentA = new A(new int[]{85, 90, 92});
        B studentB = new B(new int[]{78, 85, 88, 90});

        System.out.println("Percentage for Student A: " + studentA.getPercentage());
        System.out.println("Percentage for Student B: " + studentB.getPercentage());
    }
}
