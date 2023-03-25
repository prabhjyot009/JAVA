import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter numbers of terms: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
            for(int i=0;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("Sum of even: "+sum);

        }
        else
        {
            for(int i=1;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("Sum of odd: "+sum);
        }
    }    
}

