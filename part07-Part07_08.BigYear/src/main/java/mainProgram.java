import java.util.*;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final List<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("?");
            final String input = scan.nextLine();

            if ("quit".equalsIgnoreCase(input)) {
                break;
            }

            if ("one".equalsIgnoreCase(input)) {
                System.out.print("Bird? ");
                final String name = scan.nextLine();

                birds.stream()
                        .filter(b -> Objects.equals(b.getName(), name))
                        .findFirst()
                        .ifPresent(System.out::println);
            }

            if ("add".equalsIgnoreCase(input)) {
                System.out.print("Name: ");
                final String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                final String latinName = scan.nextLine();

                birds.add(new Bird(name, latinName));
            }

            if ("observation".equalsIgnoreCase(input)) {
                System.out.print("Bird? ");
                final String name = scan.nextLine();

                final Bird queriedBird = birds.stream()
                        .filter(b -> Objects.equals(b.getName(), name))
                        .findFirst()
                        .orElse(null);

                if (queriedBird == null) {
                    System.out.println("Not a bird!");
                    continue;
                }
                queriedBird.increaseObservationCount();

            }

            if ("all".equalsIgnoreCase(input)) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }
        }
    }

}