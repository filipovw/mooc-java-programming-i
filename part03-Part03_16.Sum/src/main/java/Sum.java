
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        sum(numbers);
    }




    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int number : numbers) {
           sum = sum + number;
            
        }
        System.out.println(sum);
        return sum;
    } 
    
}

