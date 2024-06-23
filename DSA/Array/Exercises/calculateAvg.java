package DSA.Array.Exercises;

import java.util.Scanner;

public class calculateAvg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Add size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            double avg = sum/n;
            System.out.println("Average of array sum is: " + avg);
        }
    }
}
