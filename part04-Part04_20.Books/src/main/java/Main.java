import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scan.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String input = scan.nextLine();
        if (input.equals("everything")) {
            for (Book info : books) {
                System.out.println(info.toString());
            }
        } 
        if (input.equals("name")) {
            for (Book info : books) {
                System.out.println(info.getTitle());
            }
        
        }

    }
}
