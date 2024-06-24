package DSA.Array.Practice;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // array size
            sc.nextLine(); // consume newline left by nextInt()

            String[] persons = new String[n];
            double[] heights = new double[n];

            // Input persons and heights
            for (int i = 0; i < n; i++) {
                persons[i] = sc.nextLine();
            }
            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextDouble();
            }

            // Sort persons array based on heights (bubble sort implementation)
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (heights[j] > heights[j + 1]) {
                        // Swap heights
                        double tempHeight = heights[j];
                        heights[j] = heights[j + 1];
                        heights[j + 1] = tempHeight;
                        
                        // Swap persons
                        String tempPerson = persons[j];
                        persons[j] = persons[j + 1];
                        persons[j + 1] = tempPerson;
                    }
                }
            }

            // Output sorted persons
            for (int i = 0; i < n; i++) {
                System.out.println(persons[i]);
            }
        }
    }
}
