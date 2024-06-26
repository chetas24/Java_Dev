package DSA.Array.Operations.Insertion;

public class insert4 {

    public static int[] insertEle(int[] arr, int ele)
    {
        int len = arr.length;
        int[] newArr = new int[len + 1];
        newArr[0] = ele;
        for(int i = 0; i < len; i++)
        {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static void display(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {24, 25, 26, 27};
        int ele = 23;

        display(arr);
        int newArr[] = insertEle(arr, ele);
        System.out.println();
        display(newArr);
    }
}
