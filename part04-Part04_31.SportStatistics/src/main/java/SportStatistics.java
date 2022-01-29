import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(",");
                String home = parts[0];
                String visiting = parts[1];
                int hPoints = Integer.valueOf(parts[2]);
                int vPoints = Integer.valueOf(parts[3]);
                if (home.equals(team) || visiting.equals(team)) {
                    games++;
                }
                if(home.equals(team)) {
                    if (hPoints > vPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (visiting.equals(team)){
                    if(vPoints > hPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
            
    }
}
