import java.util.Arrays;
import java.util.Scanner;

/**
 * Swap
 */
public class Swap {

    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6};
        // swap(arr,1,2);
        // System.out.println(Arrays.toString(arr));
        //user input:
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
