package DSA.Array.ArrayPrac;
import java.util.Arrays;
public class arr1 {
    public static void main(String[] args)
    {
        int[] array1={123,43,56,356,534,356,964,758};
        String[] array2={"adaf","sdfs","hihi","jioj","mnih"};
        System.out.println("The Original Array is :"+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("The Sorted numberic array is :"+Arrays.toString(array1));
        System.out.println("The original String Array is :"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("The Sorted String Array is :"+Arrays.toString(array2));
    }
}
