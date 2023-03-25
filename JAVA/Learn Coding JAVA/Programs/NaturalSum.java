import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter numbers of terms: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }    
}
