/**
 * 11. Write a  program to create an interface Sortable with a method
 * sort (int[] array) that sorts an array of integers in descending order.
 * Create two classes QuickSort and MergeSort that implement the Sortable
 * interface and provide their own implementations of the sort() method.
 */

package intefaces.q11;

public class Q11 {
    public static void main(String[] args) {
        int[] myArr;
        myArr = new int[]{10, 20, 30, 40, 50};
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        merge.sort(myArr);
        System.out.println("Sorted using Merge Sort:");
        for (int i : myArr) {
            System.out.println(i);
        }

        quick.sort(myArr);
        System.out.println("Sorted using Quick Sort:");
        for (int i : myArr) {
            System.out.println(i);
        }
    }
}

