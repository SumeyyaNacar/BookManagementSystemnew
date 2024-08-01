import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    //degiskenlerim
    private List<Book> bookList;
    private Scanner scanner;


    //constr
    public Library(Scanner scanner) {
        this.bookList = new ArrayList<>();
        this.scanner =scanner;
    }

    //kitap ekleme
    public void addBook() {
        System.out.println("Kitabin adi: ");
        String title = scanner.nextLine();
        System.out.println("Kitabin yazari: ");
        String author = scanner.nextLine();
        System.out.println("Basim yili: ");
        int year = scanner.nextInt();
        Book book = new Book(title, author, year);
        bookList.add(book);

    }

    //kitap arama
    public void searchBook() {
        System.out.println("Lutfen aradiginiz kitabin adini girin");
        String title = scanner.nextLine();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Kitap bulunamadi");

    }

    //kitaplari listeleme
    public void listBook() {
        if (bookList.isEmpty()){
            System.out.println("Listede kitap yok");
        }else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
}
