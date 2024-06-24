package DSA.Array.Exercises;

import java.util.Scanner;

public class searchElement {

    public static boolean searchEle(int[] arr, int num)
    {
        for (int i = 0; i < arr.length; i++)
            {
                if(num == arr[i])
                {
                    return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int num = 20;
            System.out.println("Add size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(searchEle(arr, num));
            System.out.println(searchEle(arr, 2));
        }
    }
}
