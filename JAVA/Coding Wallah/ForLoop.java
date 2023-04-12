import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int count = 0;
        for(;n!=0;n=n/10){
            count++;
        }
        System.out.println("No of digits in a number is "+count);
    }
}