
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            
            if (!(input.equals(""))) {
                for(int i = 0; i < 1; i++) {
                    System.out.println(pieces[i]);
                }
            } else {
                return;
            }
        }

    }
}
