import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
