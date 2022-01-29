
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int num = number;
        int start = 0;
        
        while (true) {
            if (start > num) {
                break;
            } else if (start == num) {
                System.out.println("");
                break;
            } else {
                System.out.print("*") ;
                
                start++;
            }
        }
    }

    public static void printSquare(int size) {
        int start = 0;
        
        while (true) {
            if (start < size) {
                printStars(size);
                start++;
            } else {
                break;
            } 
        }
        
        
        
    }

    public static void printRectangle(int width, int height) {
        int start = 0;
        int start1 = 0;
        
        width--;
        height--;
        
        while(true) {
            
            if (start < width) {
                System.out.print("*");
                start++;
                continue;
            } else if (start <= width) {
                System.out.println("*");
                
            }
            
            if (start1 < height) {
                start1++;
                start = 0;
                
            } else {
                break;
            }
            
        }
    }

    public static void printTriangle(int size) {
        int start = 0;
        
        while (true) {
            if (start < size) {
                start++;
                printStars(start);
                System.out.print("");
                
            
            } else {
                break;
            }
        }
    }
}
