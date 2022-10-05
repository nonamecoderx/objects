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

        //вывод книги 1
        System.out.printf("Название книги 1 - " + book1.getName() + ", Автор - " + author1.getNameAuthor() + " " + author1.getSurNameAuthor() + ", Год выпуска - " + book1.getDate());
        System.out.println();
        //вывод книги 2
        System.out.printf("Название книги 2 - " + book2.getName() + ", Автор - " + author2.getNameAuthor() + " " + author2.getSurNameAuthor() + ", Год выпуска - " + book2.getDate());
        //меняем год книги
        book1.setBookDate(1888);
        System.out.println();
        //выводим измененный год
        System.out.printf("Название книги 1 - " + book1.getName() + ", Автор - " + author1.getNameAuthor() + " " + author1.getSurNameAuthor() + ", Год выпуска - " + book1.getDate());
    }
}