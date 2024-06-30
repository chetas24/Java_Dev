package DSA.Array.BinarySearch;


public class smallestLetter {

    public static char binarySearch(char[] arr, char ele)
    {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty");
            return ele;
        }

        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (ele < arr[mid]) {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

    public static void display(char[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char ele = 'a';

        display(arr);
        System.out.println();
        char c = binarySearch(arr, ele);
        System.out.println(c);
    }
}
