
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int end = Integer.valueOf(scanner.nextLine());
        int start = 1;
        int sum = 0;
        
        for (int i = start; i <= end; i++){
            sum = sum + i;
            
            
            
            
        }
        System.out.println("The sum is " + sum);
    }
}
