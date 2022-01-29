
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        int i = 0;
        int num;
        int search;
        System.out.println("Search for? ");
        search = Integer.valueOf(scanner.nextLine());
        while (true) {
            if(i < list.size()) {
            num = list.get(i);
            if (search == num) {
                System.out.println(search + " is at index " + i);
            } 
            
            i++;
        } else {
                return;
            }
        }
  
        
        
    }
}
