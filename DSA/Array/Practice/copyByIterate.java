package DSA.Array.Practice;

import java.util.Arrays;

public class copyByIterate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int len  = arr.length;
        int[] newArr = new int[len];

        System.out.print(Arrays.toString(arr) + " ");

        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        System.out.print(Arrays.toString(newArr) + " ");

    }
}
