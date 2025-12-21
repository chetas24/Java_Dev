public class FindMaxNum
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 90, 50, 80, 70};
        int maxNum = arr[0];
        // Loop through the array to find the maximum number
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > maxNum)  // Compare each element with the current maximum
            {
                maxNum = arr[i]; // Update maxNum if a larger number is found
            }
        }
        System.out.println("The maximum number in the array is: " + maxNum);
    }
}