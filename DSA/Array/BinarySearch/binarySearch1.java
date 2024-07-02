package DSA.Array.BinarySearch;

public class binarySearch1 {
    // O(log n)

    public static void binarySearch(int[] arr, int n, int k)
    {
        // we need to obtain the mid of array so that our search become easy
        // lets first specify our edge cases
        if (arr == null || n <= 0) {
            System.out.println("Array is empty");
            return;
        }

        /*if (n == 1) {
            System.err.println(arr[0]);
            return;
        }*/

        // get the mid of array
        /*By rewriting it as mid = start+(end−start)/2, 
        you avoid adding two potentially large 
        numbers together before division, 
        thus preventing overflow. */
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == k) {
                
                System.out.println(mid);
                return;
            }

            if (k > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
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
        int[] arr = {1, 2, 3, 4, 5, 6};
        int ele = 5;
        // binary search uses divide and conquer algorithm
        int len = arr.length;
        display(arr);
        System.out.println();
        binarySearch(arr, len, ele);
    }
}
