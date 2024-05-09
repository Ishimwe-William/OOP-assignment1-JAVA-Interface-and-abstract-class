/**
 * 3. Write a  program to create an interface Flyable with a method called
 * fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that
 * implement the Flyable interface. Implement the fly_obj() method for each
 * of the three classes.
 */

package intefaces.q3;

public class Q3 {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
