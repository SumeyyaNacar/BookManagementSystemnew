import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    //degiskenlerim
    public List<Book> bookList;
    Book book;

    Scanner scanner = new Scanner(System.in);

    //constr
    public Library() {
        this.bookList = new ArrayList<>();
    }

    //kitap ekleme
    public void addBook() {
        System.out.println("Kitabin adi: ");
        String title = scanner.nextLine();
        System.out.println("Kitabin yazari: ");
        String author = scanner.nextLine();
        System.out.println("Basim yili: ");
        int year = scanner.nextInt();
        book = new Book(title, author, year);
        bookList.add(book);

    }

    //kitap arama
    public void searchBook() {
        System.out.println("Lutfen aradiginiz kitabin adini girin");
        String title = scanner.nextLine();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }

    }

    //kitaplari listeleme
    public void listBook() {
        for (Book book : bookList) {
            System.out.println(book);
        }

    }
}
