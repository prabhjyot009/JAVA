import java.util.Scanner;
public class UserInputArray {
    public static void main(String[] args) {
        //static array is an array jisme compile time se pehle he size daaldehnge ham.//size fixed
        //int[] marks=new int[5];
        //dynamic array jiska size grow karjata hai.//size grow
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int size=scan.nextInt();
        int[] marks=new int[size];
        //user input in array
        System.out.println("Enter marks of subjects:");
        for(int i=0;i<size;i++){
            marks[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(marks[i]+",");
        }
}
}
