import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //array of primitives:
        /* 
        int[] arr=new int[5];
        // arr[0]=21;
        // arr[1]=22;
        // arr[2]=23;
        // arr[3]=24;
        // arr[4]=25;
        // System.out.println(arr[3]);
        //user input:
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
        //using for each loop:
        // for(int num : arr){//for every element in the array print the element
        //     System.out.println(num +" ");//here num represents element of the array
        // }
        //using toString method
        System.out.println(Arrays.toString(arr));
        */

        //array of objects:
        String[] arr=new String[4];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.next();
        }
        System.out.println(Arrays.toString(arr));

        //modify:
        arr[1]="Sir";
        System.out.println(Arrays.toString(arr));

    }    
}
