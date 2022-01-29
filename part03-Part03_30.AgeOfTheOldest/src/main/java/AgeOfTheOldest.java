
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            if (!(input.equals(""))) {
                for(int i = 0; i < 1; i++) {                   
                    int age = Integer.valueOf(pieces[pieces.length-1]);
                    if(age > oldest) {
                        oldest = age;
                    }
                    System.out.println(oldest);
                    
                }
            } else {
                return;
            }
        }

    }
}
