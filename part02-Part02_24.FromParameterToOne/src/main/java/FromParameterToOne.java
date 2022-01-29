

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(3);

    }
    public static void printFromNumberToOne(int num){
        while(true) {
            if (num > 0) {
                System.out.println(num);
                --num;
            } else {
                break;
            }
        }
    }
        

}
