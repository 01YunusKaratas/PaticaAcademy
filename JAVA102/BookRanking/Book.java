package BookRanking;

public class Book implements Comparable<Book> {

    // Variable
    private String bookName;
    private int pageNumber;
    private String author;
    private String date;

    // Constructor
    public Book(String bookName, String author, int pageNumber, String date) {

        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
        this.date = date;
    }

    // Comparable Method
    @Override
    public int compareTo(Book other) {
        return this.bookName.compareTo(other.bookName);
    }

    // Setter and Getter methods
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {

        return "***************************************" + "\nBookName: " + this.getBookName() + "\nAuthor : "
                + this.getAuthor() + "\nPageNumber : "
                + this.getPageNumber() + "\nDate : " + this.getDate() + "\n***************************************";

    }
}
