import java.util.Objects;

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

    public String toString() {
        return this.bookName + "by" + this.author + "published in " + this.bookDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
        return false;
        }
        Book book = (Book) o;
        return bookDate == book.bookDate && Objects.equals(bookName, book.bookName)&&
        Objects.equals(author, book.author);
    }
    @Override
    public int hashCode(){
        return Objects.hash(bookName, author, bookDate);
    }
}
