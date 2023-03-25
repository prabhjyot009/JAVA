import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
       int n1,n2,ch,cal;
       System.out.println("Enter number:");
       Scanner ref=new Scanner(System.in);
       n1=ref.nextInt();
       n2=ref.nextInt();
       System.out.println("Select Choice:");
       ch=ref.nextInt();

       if(ch==1)
       {
        cal=n1+n2;
        System.out.println("Addition"+cal);
       }
       else if(ch==2)
       {
        cal=n1*n2;
        System.out.println("Multiplication"+cal);
       }
       else if(ch==3)
       {
        cal=n1-n2;
        System.out.println("Subtraction"+cal);
       }
       else if(ch==4)
       {
        cal=n1/n2;
        System.out.println("Division"+cal);
       }
       else
       {
        cal=n1%n2;
        System.out.println("Remainder"+cal);
       }
   }
}
