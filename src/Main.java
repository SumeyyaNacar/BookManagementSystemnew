import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();

    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);

        int select;
        do {
            System.out.println("====Kütüphaneye Hos Geldiniz===");
            System.out.println("Yapmak istediginiz islemi secin...");
            System.out.println("1-Kitap ekleme");
            System.out.println("2-Kitap arama");
            System.out.println("3-Kitaplari listeleme");
            System.out.println("0-Cikis...");

            Library library = new Library();

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.searchBook();
                    break;
                case 3:
                    library.listBook();
                    break;
                case 0:
                    System.out.println("Tesekkkur eder yine bekleriz...");
                    break;
                default:
                    System.out.println("Hatali giris, tekrar deneyin...");

            }
        }while (select!=0);
        scanner.close();
    }
}
