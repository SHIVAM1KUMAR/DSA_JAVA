//import java.util.Scanner;
import java.util.Scanner;
public class Tenth
{

    public static void main(String[] args)
    {
        Scanner ok = new Scanner(System.in);
        int[][] arr0 = new int[2][2];
        int[][] arr1 = new int[2][2];
        int[][] sum = new int[2][2];
        //Input Data
        for(int i=0;i< arr0.length;i++)
        {
            for(int j=0;j< arr0[i].length;j++)
            {
                System.out.printf("Enter element for array 1 at %d and %d  is ",i+1,j+1);
                arr0[i][j]=ok.nextInt();
                System.out.printf("Enter element for array 2 at %d and %d  is ",i+1,j+1);
                arr1[i][j]=ok.nextInt();
                sum[i][j]=arr0[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i< arr0.length;i++)
        {
            for(int j=0;j< arr0[i].length;j++)
            {
                System.out.printf("%d  ",sum[i][j]);
            }
            System.out.printf("\n");
        }


    }
}