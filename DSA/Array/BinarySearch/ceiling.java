package DSA.Array.BinarySearch;

public class ceiling {

    // ceiling of a number
    public static int binarySearch(int[] arr, int k)
    {
        if (arr == null || arr.length <= 0) {
            System.out.println("Array is empty");
            return k;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (k < arr[mid]) {
                end = mid - 1;
            }
            else if (k > arr[mid])
            {
                start = mid + 1;
            }
            else{
            return mid;
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
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;

        display(arr);
        System.out.println();
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}
