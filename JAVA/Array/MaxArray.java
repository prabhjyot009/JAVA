import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int[] arr={1,23,9,18,20};
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    //Range:
    static int maxRange(int[]arr,int start,int end){
        int maxVal=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
