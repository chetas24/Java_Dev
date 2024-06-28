package DSA.Array.Operations.Deletion;

public class delete3 {
    public static int[] deleteEle(int[] arr, int ele)
    {
        // check edge cases
        // first check whether the element is present in array or not
        // if the element is present then assign it to the index variable 
        int len = arr.length;
        int index = -1;
        for(int i = 0; i < len; i++)
        {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return arr;
        }
        
        int[] newArr = new int[len - 1];

        for (int i = 0; i < index; i++)
        {
            newArr[i] = arr[i];
        }

        for (int i = index + 1; i < len; i++)
        {
            newArr[i - 1] = arr[i];
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
        int[] arr = {1, 2, 3, 4, 5};
        int delEle = 3;

        display(arr);
        int newArr[] = deleteEle(arr, delEle);
        System.out.println();
        display(newArr);
    }
}
