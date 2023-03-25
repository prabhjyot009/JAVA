import java.util.Scanner;
public class RelationalOperator{
        public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Value: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("True/false: "+(a<b));
        System.out.println("True/false: "+(a>b));
        System.out.println("True/false: "+(a<=b));
        System.out.println("True/false: "+(a>=b));
        System.out.println("True/false: "+(a==b));
        System.out.println("True/false: "+(a!=b));
    }
}
