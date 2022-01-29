import java.util.*;
public class UserInterface {
    private final TodoList list;
    private final Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        String input;
        while(true) {
            System.out.println("Command: ");
            input = scan.nextLine();
            
            if(input.equals("stop")) {
                break;
            }
            if(input.equals("add")) {
                System.out.println("To add: ");
                list.add(scan.nextLine());
            }
            if(input.equals("list")) {
                list.print();
            }
            if(input.equals("remove")) {
                list.remove(scan.nextInt());
            }
        }
    }
}
