import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number 1: ");
            int a=sc.nextInt();
            System.out.println("Enter number 2: ");
            int b=sc.nextInt();
            int sum=a+b;
            System.out.println("The sum is:");
            System.out.println(sum);
        }
    }
    
}