public class Main {
    public static void main(String[] args) {
        //создаем автора 1
        Author author1 = new Author("Александр", "Пушкин");
        //создаем книгу 1
        Book book1 = new Book("Сказка о рыбаке и рыбке", author1, 1833);
        //создаем автора 2
        Author author2 = new Author("Николай", "Гоголь");
        //создаем книгу 2
        Book book2 = new Book("Ревизор", author2, 1835);
        System.out.println(book1);
        System.out.println(book2);
        book1.setBookDate(1888);
        System.out.println(book1);
    }
}