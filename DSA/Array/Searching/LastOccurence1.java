package DSA.Array.Searching;

public class LastOccurence1 {

    // this is more efficient than LastOccurence.java
    // LastOccurence1 stops searching as soon as it finds the last occurrence, potentially saving time if the element appears early in the array.
    public static void linearSearch(int[] arr, int ele)
    {
        //int x = -1;

        for(int i = arr.length - 1; i > 0; i--)
        {
            if (arr[i] == ele) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 6};
        int ele = 6;
        display(arr);
        System.out.println();
        linearSearch(arr, ele);
    }
}
