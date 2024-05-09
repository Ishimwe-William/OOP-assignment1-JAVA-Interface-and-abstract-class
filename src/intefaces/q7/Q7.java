/**
 * 7. Write a  program to create an interface Sortable with a method sort()
 * that sorts an array of integers in ascending order. Create two classes
 * BubbleSort and SelectionSort that implement the Sortable interface and
 * provide their own implementations of the sort() method.
 */

package intefaces.q7;

public class Q7 {
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        BubbleSort bubble = new BubbleSort();

        int[] myNum = {10, 20, 30, 40};
        selection.sort(myNum);

        System.out.println("Sorted using Selection Sort:");
        for (int i : myNum) {
            System.out.println(i);
        }
        bubble.sort(myNum);

        System.out.println("Sorted using bubble Sort:");
        for (int i : myNum) {
            System.out.println(i);
        }
    }
}

