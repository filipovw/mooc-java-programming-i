
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> ids = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()) {
                break;
            }
            if(!(ids.contains(id))) {
                ids.add(id);
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        for(int i = 0; i < names.size() && i < ids.size(); i++) {
            System.out.println(ids.get(i) + ": " + names.get(i));
        }
        

    }
}
