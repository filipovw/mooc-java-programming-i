
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
                
        while (true) {
            System.out.println("Give a number: ");
            int a = Integer.valueOf(scanner.nextLine());
            
            if (a != 0) {
                count = count + 1;
            }
             
            if (a == 0) {
                System.out.println("Number of numbers: " + count);
                break;
        
            }
            
            
            
        }
        
        
        
        
    }
}
