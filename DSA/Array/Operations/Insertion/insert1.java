package DSA.Array.Operations.Insertion;

public class insert1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // Inserting in Array at end
        // if the array is fixed sized and contains data then we can insert an element at the end
        arr[0] = 11;
        arr[1] = 33;
        arr[2] = 44;
        arr[3] = 22;
        arr[4] = 55;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
