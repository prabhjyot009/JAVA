import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.println("Enter any value:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
