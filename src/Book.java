public class Book {
    private String bookName;
    private int bookDate;

    public Book(String bookName, int bookDate) {
        this.bookName = bookName;
        this.bookDate = bookDate;
    }

    public String getName() {
        return this.bookName;
    }

    public int getDate() {
        return this.bookDate;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookDate(int bookDate) {
        this.bookDate = bookDate;
    }

}
