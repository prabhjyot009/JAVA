import java.util.Scanner;
public class SwappingThirdVar {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("Enter number:");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        b=ref.nextInt();
        System.out.println("Before Swapping:"+a+" "+b);

        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping:"+a+" "+b);
    }
}
