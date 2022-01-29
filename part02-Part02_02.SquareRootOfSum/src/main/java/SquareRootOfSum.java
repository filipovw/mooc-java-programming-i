
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double one = Double.valueOf(scanner.nextLine());
        double two = Double.valueOf(scanner.nextLine());
        
        double sq = Math.sqrt(one+two);
        System.out.println(sq);
    }
}
