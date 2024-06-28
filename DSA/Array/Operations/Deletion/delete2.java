package DSA.Array.Operations.Deletion;

public class delete2 {

    public static int[] deleteEle(int[] arr)
    {
        int len = arr.length;
        // If the array is empty or has only one element, return an empty array
        if (len <= 1) {
            return new int[0];
        }

        int[] newArr = new int[len - 1];
        for(int i = 1; i < len; i++)
        {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {25, 14, 56, 15, 36};
        //int ele = 25;

        display(arr);
        int newArr[] = deleteEle(arr);
        System.out.println();
        display(newArr);
    }
}
