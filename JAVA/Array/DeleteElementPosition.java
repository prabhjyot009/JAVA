import java.util.Scanner;

public class DeleteElementPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position of element to delete:");
        int position=sc.nextInt();
        delete(arr,position);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void delete(int[] arr,int position){
        for (int i = position-1; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
}
