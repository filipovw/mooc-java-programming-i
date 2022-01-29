
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        Integer sum = (num1 + num2);
        
        String plus = " + ";
        String equals = " = ";
        
        System.out.println(num1 + plus + num2 + equals + sum);


    }
}
