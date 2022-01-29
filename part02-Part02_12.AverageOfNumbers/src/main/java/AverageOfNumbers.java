
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double avg = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                System.out.println("Average of the numbers: " + avg);
                break;
            } else {
                count = count + 1;
                sum = num + sum;
                avg = (sum / count);
            }
        }
    }
}
