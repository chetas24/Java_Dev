package DSA.Array.Exercises.ex1;

import java.util.Arrays;

// sort a numeric array array
public class ex1 {
    public static void main(String[] args) {
        
        int[] arr1 = {342, 444, 452, 465, 232, 452, 214, 157};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("sorted Array: " + Arrays.toString(arr1));          
        
    }
}
