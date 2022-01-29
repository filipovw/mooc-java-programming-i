import java.util.*;
public class TextUI {
    private final Scanner scan;
    private final SimpleDictionary sd;
    
    public TextUI(Scanner scan, SimpleDictionary sd) {
        this.scan = scan;
        this.sd = sd;
        
    }
    
    public void start() {
        String input;
        String input1;
        while(true) {
            System.out.println("Command: ");
            input = scan.nextLine();
            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if(input.equals("add")) {
                System.out.println("Word: ");
                input = scan.nextLine();
                System.out.println("Translation: ");
                input1 = scan.nextLine();
                sd.add(input, input1);
            }
            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if(input.equals("search")) {
                System.out.println("To be translated: ");
                input = scan.nextLine();
                if(sd.translate(input) == null) {
                    System.out.println("Word " + input + " was not found");
                    continue;
                }
                System.out.println("Translation: " + sd.translate(input));
            }
        }
        
    }
}
