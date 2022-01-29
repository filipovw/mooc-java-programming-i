
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        String input;
        String[] input1;
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            input1 = input.split(" ");
            String asd = String.valueOf(input1[0]);
            int asd1 = Integer.valueOf(input1[1]);
            if (asd.equals("add")) {
                if(container1.contains() + asd1 <= 100 && asd1 >= 0) {
                container1.add(Integer.valueOf(input1[1]));     
                } else if(asd1 >= 0) {
                    container1.add(100);
                }
            }
            if(asd.equals("move")) {
                if(container1.contains() - asd1 >= 0 && asd1 + container2.contains() < 100) {
                    container1.remove(asd1);
                    container2.add(asd1);
                } else if(asd1 + container2.contains() > 100) {
                    container2.add(100);              
                } else {
                    container2.add(container1.contains());
                    container1.remove(100);
                }
            }
            if(asd.equals("remove")) {
                if (container2.contains() > 0) {
                    if(container2.contains() - asd1 >= 0) {
                        container2.remove(asd1);
                    } else {
                        container2.remove(100);
                    }
                }
            }
            

        }
    }

}
