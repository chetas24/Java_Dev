package DSA.Array.Operations.Insertion;

public class insert6 {
    public static int[] insertEle(int[] arr, int ele)
    {
        int len = arr.length;
        int newArr[] = new int[len + 1];
        int n = newArr.length;
        
        for(int i = 0; i < len; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[n - 1] = ele;
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
        // insert an element at the back but the array is fixed size
        int[] arr = {2, 4, 6, 8};
        int ele = 10;

        display(arr);
        int newArr[] = insertEle(arr, ele);
        System.out.println();
        display(newArr);
    }
}
