
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i >= 0; i++) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println(i);
                break;
            }
        }
    }
}
