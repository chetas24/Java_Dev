package DSA.Array.Operations.Insertion;

public class insert3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // Inserting in Array in between
        arr[0] = 11;
        arr[1] = 33;
        arr[2] = 44;
        arr[3] = 22;
        arr[4] = 55;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        insertInBetween(arr, 66);
        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertInBetween(int arr[], int val)
    {
        for(int i = arr.length - 1; i > 3 - 1; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[3 - 1] = val;
        // incomplete solution because last elements get removed
    }
}
