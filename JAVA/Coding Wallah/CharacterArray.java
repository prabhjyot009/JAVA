//wap to take character array as input and display it
import java.util.Scanner;
public class CharacterArray {
    public static void main(String[] args) {
        System.out.println("Enter number of subjects:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        char[] marks=new char[size];
        System.out.println("Enter marks of subjects");
        for(int i=0;i<size;i++){
            marks[i]=sc.next().charAt(4);
        }
        for(int i=0;i<size;i++){
            System.out.println("Marks:"+marks[i]);
        }}
    }