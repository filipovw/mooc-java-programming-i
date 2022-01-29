import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        ArrayList<Integer> numbersList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            int numberEntered = Integer.valueOf(scanner.nextLine());
            if (numberEntered == 999) {
                break;
            }
            numbersList.add(numberEntered);
        }
        
        System.out.println("");
        
        //First search for the smallest number and print it
        int smallestNumber = numbersList.get(0);
        for (int i = 0; i < numbersList.size(); i++) {
            int numberAtPositionI = numbersList.get(i);
            if (numberAtPositionI < smallestNumber) {
                smallestNumber = numberAtPositionI;
            }
        }
        System.out.println("Smallest number: " + smallestNumber);

        //Then print out the index of the smallest number
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == smallestNumber) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}