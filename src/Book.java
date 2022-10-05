public class Book {
    private String bookName;
    Author author;
    private int bookDate;
    public Book(String bookName, Author author, int bookDate) {
        this.bookName = bookName;
        this.bookDate = bookDate;
        this.author = author;
    }
    public String getName() {
        return this.bookName;
    }
    public int getDate() {
        return this.bookDate;
    }

    public void setBookDate(int bookDate) {
        this.bookDate = bookDate;
    }
}
