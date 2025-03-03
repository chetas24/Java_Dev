package DSA.Array.ArrayPrac;
import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers for Addition");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : arr)
        {
            
            sum +=i;
        }
        System.out.println("The Sum is: "+sum);
    }
}
