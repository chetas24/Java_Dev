package DSA.Array.Operations.Insertion;

public class insert2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // Inserting in Array at begining
        arr[0] = 11;
        arr[1] = 33;
        arr[2] = 44;
        arr[3] = 22;
        arr[4] = 55;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        int ele = 20;

        int a[] = insertAtStart(arr, ele);
        System.out.println();
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        
    }

    public static int[] insertAtStart(int[] arr, int val)
    {
        int len = arr.length;
        int[] newArr = new int[len + 1];
        newArr[0] = val;
        for (int i = 0; i < len; i++)
        {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
}
