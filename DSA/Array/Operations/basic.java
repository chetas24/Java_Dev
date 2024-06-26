package DSA.Array.Operations;

public class basic {
    public static void main(String[] args) {
        int[] arrNum = new int[3];
        arrNum[0] = 5;
        arrNum[1] = 10;
        arrNum[2] = 20;
        for(int i = 0; i < arrNum.length; i++)
        {
            System.out.println(arrNum[i]);
        }
        arrNum[2] = 15; 
        System.out.println();
        for(int i = 0; i < arrNum.length; i++)
        {
            System.out.println(arrNum[i]);
        }

        System.out.println();
        // enhanced for loop
        for (int ele : arrNum)
        {
            System.out.println(ele);
        }
    }
}
