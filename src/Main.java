public class Main {
    public static void main(String[] args) {
        //создаем книгу 1
        Book book1 = new Book("Сказка о рыбаке и рыбке", 1833);
        //создаем автора 1
        Author author1 = new Author("Александр", "Пушкин");
        //вывод книги 1
        System.out.printf("Название книги 1 - " + book1.getName() + ", Автор - " + author1.getAuthor() + " " + author1.getSurName() + ", Год выпуска - " + book1.getDate());
        System.out.println();
        //создаем книгу 2
        Book book2 = new Book("Ревизор", 1835);
        //создаем автора 2
        Author author2 = new Author("Николай", "Гоголь");
        //вывод книги 2
        System.out.printf("Название книги 2 - " + book2.getName() + ", Автор - " + author2.getAuthor() + " " + author2.getSurName() + ", Год выпуска - " + book2.getDate());
        //меняем год книги
        book1.setBookDate(1888);
        System.out.println();
        //выводим измененный год
        System.out.printf("Название книги 1 - " + book1.getName() + ", Автор - " + author1.getAuthor() + " " + author1.getSurName() + ", Год выпуска - " + book1.getDate());
    }
}