import java.util.Arrays;

public class removeElement1 {
    public static int[] remElement(int[] arr, int n, int x)
    {
        //int[] newArr = new int[len];
        for (int i = x; i < n - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = 0;
        return arr;
    }
    public static void main(String[] args) {
        // remove a specific element from array
        // using two array

        int[] arr = {25, 14, 56, 15, 36};
        //int n = arr.length;
        int eletorem = 56;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        } 
        System.out.println();
        int[] newArr = remElement(arr, arr.length, eletorem);

        System.out.println("Array after removing element:");
        System.out.println(Arrays.toString(newArr));
    }
}
