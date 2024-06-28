package DSA.Array.Searching;

public class LastOccurence {
    
    public static void linearSearch(int[] arr, int ele)
    {
        int x = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ele) {
                x = i;
            }
        }
        if (x != -1) {
            System.out.println("Last occurrence of element " + ele + " is at index: " + x);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 1, 6};
        int ele = 6;
        display(arr);
        System.out.println();
        linearSearch(arr, ele);
    }
}
