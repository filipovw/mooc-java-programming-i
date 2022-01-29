
import java.nio.file.Paths;
import java.util.*;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                list.add(scan.nextInt());
            }
        } catch (Exception e) {
            
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                count++;
            }
            
        }
            System.out.println("Numbers: " + count);
            
    }

}
