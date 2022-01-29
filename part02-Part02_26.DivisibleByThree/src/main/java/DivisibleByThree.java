
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,5);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        while(true) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
                beginning++;
            } else if (beginning % 3 != 0) {
                beginning++;
                if (beginning > end) {
                    break;
                }
                
            } else if (beginning > end) {
                break;
            }
        }
    }
}
