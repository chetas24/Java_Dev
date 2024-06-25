public class findIndex {
    /*
    public static void main(String[] args) {
        // given array
        int[] arr = {25, 14, 56, 15, 36};
        int findIndex = 6;
        for (int i = 0; i < arr.length; i++)
        {
            if (findIndex == arr[i]) {
                System.out.println("Element found at " + i + " position");
            }
        }
    }
    */

    public static int findI(int[] arr, int n, int x)
    {
        for (int i = 0; i < n; i++)
        {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36};
        int findIndex = 14;

        int result = findI(arr, arr.length, findIndex);
        if (result != -1) {
            System.out.println("Element found at " + result + " position");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
