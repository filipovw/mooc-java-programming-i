
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        while(true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
            
        }
        double sum = 0;
        double count = 0;
        for(int num : list) {
            sum += num;
            count++;
        }
        System.out.println(sum / count);
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
