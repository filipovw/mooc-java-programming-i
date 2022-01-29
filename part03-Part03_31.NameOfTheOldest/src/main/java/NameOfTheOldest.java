import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String name="";

        while (true) {

            String nameAge=scanner.nextLine();
            if (nameAge.equals("")) {
                break;
            }
            String[] sepNameAge=nameAge.split(",");
            int theAge=Integer.valueOf(sepNameAge[1]);
            if (theAge>oldest) {
                oldest=theAge;
                name=sepNameAge[0];
            }

        }

        System.out.println("The oldest person: "+name);
    }
}