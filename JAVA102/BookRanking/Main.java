package BookRanking;

import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create TreeSet
        Set<Book> book1 = new TreeSet<>();

        // Create objects book and addded in Treeset
        book1.add(new Book("To Kill a Mockingbird", "Harper Lee", 281, "1960"));
        book1.add(new Book("1984", "George Orwell", 328, "1949"));
        book1.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 200, "1925"));
        book1.add(new Book("Moby Dick", "Herman Melville", 635, "1851"));
        book1.add(new Book("Pride and Prejudice", "Jane Austen", 432, "1813"));

        System.out.println("Total BOOK : " + book1.size());
        System.out.println("");
        Iterator<Book> ıtr = book1.iterator();
        while (ıtr.hasNext()) {
            {
                System.out.println(ıtr.next());
            }

        }

    }

}
