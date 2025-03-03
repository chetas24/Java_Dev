package Streams;

public class basic {
    public static void main(String[] args) {
        String input = "Ab#c^de!$";
        String result = reverseString(input);
        System.out.println("Reversed String: "+ result);

    }

    public static String reverseString(String str)
    {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while(left < right)
        {
            if(!Character.isLetterOrDigit(arr[left]))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(arr[right]))
            {
                right--;
            }
            else
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
