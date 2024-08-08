package JAVA102.BookList;

/**
 * Book
 */
public class Book {

    private String bookName;
    private String author;
    private int pageNumber;
    private String releaseDate;

    public Book(String bookName, String author, int pageNumber, String releaseDate) {

        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;

    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}