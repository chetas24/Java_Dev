import java.util.Arrays;

public class removeElement {

    public static int[] remElement(int[] arr, int n, int x)
    {
        int len = n-1;
        int[] newArr = new int[len];
        for (int i = 0, j = 0; i < len; i++)
        {
            if (i != x) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        // remove a specific element from array
        // using two array

        int[] arr = {25, 14, 56, 15, 36};
        //int n = arr.length;
        int eletorem = 2;
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
