
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        
        System.out.println("Last number? ");
        int end = Integer.valueOf(scanner.nextLine());
        
        int fac =  1;
        
        for(int i = start; i <= end; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial: " + fac);
    }
}
