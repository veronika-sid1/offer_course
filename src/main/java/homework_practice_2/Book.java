package homework_practice_2;

public class Book {

    String title;
    String author;

    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "Алексей Толстой");
        book1.setAuthor("Лев Толстой");
        book1.printInfo();
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void printInfo() {
        System.out.println("Название книги: " + this.title + ", автор книги: " + this.author);
    }
}
