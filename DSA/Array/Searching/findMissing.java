package DSA.Array.Searching;

public class findMissing {
    public static void linearSearch(int[] arr)
    {
        // Edge Cases
        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }

        // calculate the n natural numbers;
        int n = arr.length + 1;
        int expectecSum = n*(n+1)/2;

        int actualSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            actualSum += arr[i];
        }
        System.out.println(expectecSum - actualSum);
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        display(arr);
        System.out.println();
        linearSearch(arr);
    }
}
