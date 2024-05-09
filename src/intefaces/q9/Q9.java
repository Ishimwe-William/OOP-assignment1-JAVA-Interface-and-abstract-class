/**
 * 9. Write a  program to create an interface Searchable with a method
 * search(String keyword) that searches for a given keyword in a text
 * document. Create two classes Document and WebPage that implement the
 * Searchable interface and provide their own implementations of the search() method.
 */

package intefaces.q9;

public class Q9 {
    public static void main(String[] args) {
        boolean found = false;
        Document doc = new Document();
        WebPage web = new WebPage();

        found = doc.search("Bunsen");
        System.out.println("Found? " + (found ? "Yes" : "No"));
        found = web.search("Found");
        System.out.println("Found? " + (found ? "Yes" : "No"));

    }
}

