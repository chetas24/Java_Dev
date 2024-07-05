package DSA.Sorting;

public class selectionSort {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    public static void sort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int minidx = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[minidx] > arr[j])
                {
                    minidx = j;
                }
            }
            if (minidx != i) {
                swap(arr,i, minidx);
            }
        }
    }

    public static void display(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};

        display(arr);
        sort(arr);
        System.out.println();
        display(arr);
    }
}
