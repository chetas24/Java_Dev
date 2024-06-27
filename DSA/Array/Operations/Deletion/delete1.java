package DSA.Array.Operations.Deletion;

public class delete1 {

    public static int[] deleteEle(int[] arr)
    {
        int len = arr.length;
        //arr[len-1] = 0;
        int[] newArr = new int[len - 1];
        for(int i = 0; i < len - 1; i++)
        {
            newArr[i] = arr[i];
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
        //Delete an element at the end
        int[] arr = {1, 2, 3, 4};

        display(arr);
        int a[] = deleteEle(arr);
        System.out.println();
        display(a);
    }
}
