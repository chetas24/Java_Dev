package DSA.Sorting;

public class bubbleSort {

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    public static void sort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    swap(arr, j, j + 1);
                }
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
