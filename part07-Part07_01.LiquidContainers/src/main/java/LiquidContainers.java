
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        String input;
        String[] input1;
        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            input1 = input.split(" ");
            String asd = String.valueOf(input1[0]);
            int asd1 = Integer.valueOf(input1[1]);
            if (asd.equals("add")) {
                if(container1 + asd1 <= 100 && asd1 >= 0) {
                container1 += Integer.valueOf(input1[1]);     
                } else if(asd1 >= 0) {
                    container1 = 100;
                }
            }
            if(asd.equals("move")) {
                if(container1 - asd1 >= 0 && asd1 + container2 < 100) {
                    container1 -= asd1;
                    container2 += asd1;
                } else if(asd1 + container2 > 100) {
                    container2 = 100;              
                } else {
                    container2 = container1;
                    container1 = 0;
                }
            }
            if(asd.equals("remove")) {
                if (container2 > 0) {
                    if(container2 - asd1 >= 0) {
                        container2 -= asd1;
                    } else {
                        container2 = 0;
                    }
                }
            }
            

        }
    }

}
