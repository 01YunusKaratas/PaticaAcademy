package JAVA102.BookList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class User {

    public void start() {
        // Create 10 object over Book class
        Book b1 = new Book("1984", "George Orwell", 328, "1949-06-08");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 281, "1960-07-11");
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, "1925-04-10");
        Book b4 = new Book("Moby Dick", "Herman Melville", 635, "1851-10-18");
        Book b5 = new Book("Pride and Prejudice", "Jane Austen", 279, "1813-01-28");
        Book b6 = new Book("War and Peace", "Leo Tolstoy", 1225, "1869-01-01");
        Book b7 = new Book("The Catcher in the Rye", "J.D. Salinger", 214, "1951-07-16");
        Book b8 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178, "1954-07-29");
        Book b9 = new Book("The Hobbit", "J.R.R. Tolkien", 310, "1937-09-21");
        Book b10 = new Book("The Alchemist", "Paulo Coelho", 99, "1988-04-25");

        // Create arraylist
        ArrayList<Book> arry = new ArrayList<>();
        // added in the arraylist
        arry.add(b1);
        arry.add(b2);
        arry.add(b3);
        arry.add(b4);
        arry.add(b5);
        arry.add(b6);
        arry.add(b7);
        arry.add(b8);
        arry.add(b9);
        arry.add(b10);

        // Map<String, String> oluşturma: kitap ismini yazar ismi ile eşleştirme
        Map<String, String> bookAuthorMap = arry.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthor));

        bookAuthorMap.forEach((bookName, author) -> System.out.println("Book : " + bookName + ", Author : " + author));

        System.out.println("****************************************************************");

        List<Book> bookfilters = arry.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        bookfilters.forEach(book -> System.out.println("Book: " + book.getBookName() + ", Author: " + book.getAuthor() +
                ", Pages: " + book.getPageNumber() + ", Release Date: " + book.getReleaseDate()));

    }

}
