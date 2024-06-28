package DSA.Array.Searching;

public class LinearSearch1 {
    public static void linearSearch(int[] arr, int len, int ele)
    {
        for(int i = 0; i < len; i++)
        {
            if (arr[i] == ele) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("ELement not found");
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 1, 8};
        int len = arr.length;
        int ele = 6;

        display(arr);
        System.out.println();
        linearSearch(arr, len, ele);
    }
}
