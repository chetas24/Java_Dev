public class SecondLargest
{
    public static void main (String[] args)
    {
        int[] arr = {10, 5, 20, 8, 15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest element.");
        }
        else
        {
            System.out.println("The second largest element is: " + secondLargest + "\n largest is: " + largest);
        }
    }
}