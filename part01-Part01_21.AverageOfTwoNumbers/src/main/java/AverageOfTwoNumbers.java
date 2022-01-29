
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        //Assigns Scanner
        Scanner scanner = new Scanner(System.in);
         
        //Prompts the user for 1st number and stores it in an integer
        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        //Prompts the user for 2nd number and stores it in an integer
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        //Sums the numbers up
        int sum = (num1 + num2);
        
        //Assigns a variable to the average and multiplies by one to be rounded correctly
        double avg = 1.0* sum/2;
        
        //Prints the average
        System.out.println("The average is " + avg);

    }
}
