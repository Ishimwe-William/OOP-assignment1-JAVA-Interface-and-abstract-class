/**
 * 5.Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
 * Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a
 * class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the
 * class 'Animals'. Now create an object for each of the subclasses and call
 * their respective methods.
 */

package abstracts.q5;


public class Q5 {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.cats();
        dog.dogs();
    }
}
