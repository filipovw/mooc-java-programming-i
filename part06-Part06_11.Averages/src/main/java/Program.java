
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeRegister grades = new GradeRegister();
        UserInterface ui = new UserInterface(grades, scan);
        ui.start();
    }
}
