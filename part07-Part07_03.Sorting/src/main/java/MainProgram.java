import java.util.*;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int array[]) {
        int smallest = array[0];
        for(int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++){
            if (array[i] <= min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int min = table[index];
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= min) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int ios = indexOfSmallestFrom(array, i);
            swap(array, ios, i);
        }
        
    }
}


