package DSA.Array.Exercises.ex2;

public class ex2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 9};

        int temp = 0;
        for (int i = 0; i < arr.length; i++)
        {
            temp = temp + arr[i];
        }

        /*for (int i : arr) {
            temp = temp + i
        }*/
        System.out.println("Sum of Array: " + temp);
    }
}
