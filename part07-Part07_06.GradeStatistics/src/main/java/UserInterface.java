import java.util.*;
public class UserInterface {
    private final Scanner scan = new Scanner(System.in);
    
    public void start() {
        System.out.println("Enter point totals, - 1 stops: ");
        Grades list = new Grades();
        while(true) {
            int input = scan.nextInt();
            if(input == -1) {
                break;
            }
            if(input <=100 && input >= 0) {
                list.add(input);
            }
        }
        System.out.println("Point average (all): " + list.average(list));
        if(list.pointAveragePassing(list) == 0) {
            System.out.println("Point average (passing): -");
        } else {
        System.out.println("Point average (passing): " + list.pointAveragePassing(list));
        }
        System.out.println("Pass percentage: " + list.passPercentage(list));
        System.out.println("Grade distribution: " + list.gradeDistribution(list));
    }
}
