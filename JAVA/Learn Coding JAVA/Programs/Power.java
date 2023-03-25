import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("Enter number:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        System.out.println("Enter Power:");
        p=ref.nextInt();

        for(int i=1;i<=p;i++)
        {
            result=result*n;
        }
        System.out.println("Power is"+result);
    }
}
