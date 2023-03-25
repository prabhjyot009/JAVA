import java.util.Scanner;
public class ArithemeticOperator {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Value: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Remainder: "+(a%b));    }
}
