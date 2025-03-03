package DSA.Array.BinarySearch;

public class firstLastPos {

    public static int binarySearch(int[] arr, int ele)
    {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty");
            return ele;
        }

        int start = 0;
        int end = arr.length + 1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if (ele == arr[mid]) 
            {
                
            }
            else if (ele < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int ele = 7;

        display(arr);
        System.out.println();
        int result = binarySearch(arr, ele);
        System.out.println(result);
    }
}
