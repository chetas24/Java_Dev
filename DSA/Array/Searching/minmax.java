package DSA.Array.Searching;

public class minmax {
    public static void linearSearch(int[] arr)
    {
        // Edge Cases
        if(arr == null || arr.length == 0)
        {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 8};
        //int ele = 6;

        display(arr);
        System.out.println();
        linearSearch(arr);
    }
}
