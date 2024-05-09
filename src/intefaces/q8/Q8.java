/**
 * 8. Write a  program to create an interface Playable with a method play()
 * that takes no arguments and returns void. Create three classes Football,
 * Volleyball, and Basketball that implement the Playable interface and
 * override the play() method to play the respective sports.
 */

package intefaces.q8;

public class Q8 {
    public static void main(String[] args) {
        Football foot = new Football();
        Volleyball volley = new Volleyball();
        Basketball basket = new Basketball();

        foot.play();
        volley.play();
        basket.play();
    }
}

