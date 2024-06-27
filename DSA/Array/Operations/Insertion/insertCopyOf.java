package DSA.Array.Operations.Insertion;

import java.util.Arrays;

public class insertCopyOf {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        int len = arr.length;
        char[] newArr = Arrays.copyOf(arr, len + 1);
        newArr[len] = 'd';

        for (int i = 0; i < newArr.length; i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }
}
