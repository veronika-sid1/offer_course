package practice_2;

public class Book {
    String title;
    String author;

    public static void main(String[] args) {
    Book book1 = new Book("Война и мир", "Толстой");
    book1.setAuthor("Достоевский");
    book1.printInfo();
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return  title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo() {
        System.out.println("Имя автора " + this.author + ", название книги " + this.title);
    }
}
