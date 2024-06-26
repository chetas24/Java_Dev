package DSA.Array.Operations;

public class twodarray {
    public static void main(String[] args) {
        int[][] twodarr = new int[3][4];
        /*twodarr = { {1,2,3},
                    {4,5,6},
                    {7,8,9},
                    {10,11,12}
                  };*/

        twodarr[0][0] = 1;
        twodarr[0][1] = 2;
        twodarr[0][2] = 3;
        twodarr[0][3] = 4;
        twodarr[1][0] = 5;
        twodarr[1][1] = 6;
        twodarr[1][2] = 7;
        twodarr[1][3] = 8;
        twodarr[2][0] = 9;
        twodarr[2][1] = 10;
        twodarr[2][2] = 11;
        twodarr[2][3] = 12;
        
        for (int i = 0; i < twodarr.length; i++)
        {
            for (int j = 0; j < twodarr[i].length; j++)
            {
                System.out.println(twodarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
