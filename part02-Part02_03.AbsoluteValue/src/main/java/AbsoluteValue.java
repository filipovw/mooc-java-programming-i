
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = Integer.valueOf(scanner.nextLine());
        
        if (num1 >= 0) {
            System.out.print(num1);
        } else {
            System.out.print(num1 * -1);
        }
    }
}
