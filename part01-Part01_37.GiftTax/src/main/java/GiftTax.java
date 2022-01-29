
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        if (value >= 5000 && value < 25000) {
            double tax = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (value >= 25000 && value < 55000) {
            double tax1 = (1700 + (value - 25000) * 0.1);
            System.out.println("Tax: " + tax1);
        } else if (value >= 55000 && value < 200000) {
            double tax2 = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: " + tax2);    
        } else if (value >= 200000 && value < 1000000) {
            double tax3 = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: " + tax3);
        } else if (value >= 1000000) {
            double tax4 = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: " + tax4);
        } else if (value < 5000) {
            System.out.println("No tax!");
        }
        
       
        
   
        
        
        
        
        
        
       
    }
}
