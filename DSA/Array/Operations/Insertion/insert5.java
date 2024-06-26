package DSA.Array.Operations.Insertion;

public class insert5 {

    // for more solution we can use Arrays.copyOf() or ArrayList

    public static int[] insertEle(int[] arr, int ele, int pos)
    {
        int len = arr.length;
        int[] newArr = new int[len + 1];

        for(int i = 0; i < pos; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[pos] = ele;

        for (int i = pos; i < len; i++)
        {
            newArr[i+1] = arr[i];
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
        int[] arr = {1, 2, 4, 5};
        int ele = 3;
        int pos = 2;

        display(arr);
        int a[] = insertEle(arr, ele, pos);
        System.out.println();
        display(a);
    }
}
