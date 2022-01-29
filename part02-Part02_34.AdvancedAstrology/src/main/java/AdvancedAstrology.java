
public class AdvancedAstrology {

    public static void printStars(int number) {
        int start = 0;
       
        while (true) {
            if (start < number) {
                System.out.print("*");
                start++;
            } else {
                System.out.println("");
                break;
            }
        }
    }

    public static void printSpaces(int number) {
        int start = 0;
       
        while (true) {
            if (start < number) {
                System.out.print(" ");
                start++;
            } else {
                
                break;
            }
        }
    }
    

    public static void printTriangle(int size) {
        int start = 0;
        int end = size - 1;
       
        while (true) {
            if (start < size) {
                printSpaces(end);
                printStars(size - end);
               
                start++;
                end--;
                
            } else {   
                break;
            }
        }
    }

    public static void christmasTree(int height) {
        int start = 1;
        int end = height - 1;
        int center = start / 2 + end - 1;
                
        while (true) {
            if (start < height * 2) {
                printSpaces(end);
                printStars(start);
                end--;
                start = start + 2;
                
            } else {
                printSpaces(center);
                printStars(3);
                printSpaces(center);
                printStars(3);
                break;
            }
        }
    }
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
    
    
}
