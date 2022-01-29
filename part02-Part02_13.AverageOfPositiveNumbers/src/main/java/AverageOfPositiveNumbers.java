import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        double avg = 0;
        boolean allNegatives = true;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num > 0) {
                allNegatives = false;
                count = count + 1;
                sum = num + sum;
                avg = (sum / count);
                
            } else if (num == 0) {
                if (allNegatives) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(avg);
                    break;
                }
            }
        }
               
       
 
    }
 
}