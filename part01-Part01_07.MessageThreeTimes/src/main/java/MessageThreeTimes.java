
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        
        //Creates scanner
        Scanner scanner = new Scanner(System.in);
        
        //Gives user a prompt to write a message
        System.out.println("Write a message:");
        
        //Stores the user inputted message in a string
        String message = scanner.nextLine();
        
        //Prints the user inputted message 3 times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        

    }
}
