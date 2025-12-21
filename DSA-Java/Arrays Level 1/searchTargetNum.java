public class SearchTargetNum
{
    public static void main(String[] args)
    {
        int[] arr = {4, 9, 1, 7};
        int target = 7;
        boolean found = false;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] ==  target)
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("Target number " + target + " is found in the array.");
        }
        else
        {
            System.out.println("Target number " + target + " is not found in the array.");
        }
    }
}