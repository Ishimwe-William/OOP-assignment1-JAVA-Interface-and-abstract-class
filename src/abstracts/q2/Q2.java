/**
 * 2.Create an abstract class 'Bank' with an abstract method 'getBalance'.
 * $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA',
 * 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method
 * named 'getBalance'. Call this method by creating an object of each of
 * the three classes.
 */

package abstracts.q2;


public class Q2 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Bank A balance: " + a.getBalance());
        System.out.println("Bank B balance: " + b.getBalance());
        System.out.println("Bank C balance: " + c.getBalance());
    }
}
