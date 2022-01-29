
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where?");
                int start = Integer.valueOf(scanner.nextLine());
            
                System.out.println("To where?");
                int end = Integer.valueOf(scanner.nextLine());
                
                while(true) {
                    if (start <= end) {
                        System.out.println(numbers.get(start));
                        start++;
                        
                    } else {
                        return;
                    }
                }
            }
            
            numbers.add(number);
            
        }

    }
}
