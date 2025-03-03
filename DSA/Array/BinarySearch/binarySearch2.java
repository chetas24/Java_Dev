package DSA.Array.BinarySearch;

public class binarySearch2 {


    public static int binarySear(int[] arr, int target){

        int left = 0, right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target)
            {
                return mid;
            } 
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
    return -1;
}

    public static void main(String[] args) {
    int[] arr = { 12, 15, 18, 21, 25};
    int target = 18;
    int result = binarySear(arr, target);   

    if(result != -1)
    {
        System.out.println("ELement found at Position: " + result);
    }
    else
    {
        System.out.println("Element not found");
    }

}
}
