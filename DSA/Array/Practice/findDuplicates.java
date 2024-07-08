package DSA.Array.Practice;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 6};
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; i < arr.length; i++)
            {
                if(arr[i] == arr[j] & i != j)
                {
                    System.out.println("Duplicate Elements: " + arr[j]);
                }
            }
        }
    }
}
