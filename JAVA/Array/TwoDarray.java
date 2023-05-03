import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        //Initialization:
        /*
         * int[][] arr=new int[rows][coloumns]
         * adding rows is compulsory and adding coloumns is not compulsory!
         */
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println(arr.length);
        // Input:
        // for rows:
        for(int rows=0;rows<arr.length;rows++){
            //for coloumns:
            for(int col=0;col<arr[rows].length;col++){
                arr[rows][col]=in.nextInt();
            }
        }
        //Ouput:
        // for(int rows=0;rows<arr.length;rows++){
        //     //for coloumns:
        //     for(int col=0;col<arr[rows].length;col++){
        //         System.out.print(arr[rows][col]+" ");
        //     }
        //     System.out.println();
        // }

        //using to string:
        // for(int rows=0;rows<arr.length;rows++){
        //     System.out.println(Arrays.toString(arr[rows]));
        // }
        //using for each loop;
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
