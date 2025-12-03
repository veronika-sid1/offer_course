package homework_practice_3;

public class LibraryTest {

    public static void main(String[] args) {
        Library library = new Library("Война и мир", "Толстой", 1900, "Классика");
        library.printInfo();
        System.out.println(library.getBookTitle());
        //System.out.println(library.bookTitle); для ошибки private access
        System.out.println(library.author);
        System.out.println(library.year);
        System.out.println(library.category);
    }
}
