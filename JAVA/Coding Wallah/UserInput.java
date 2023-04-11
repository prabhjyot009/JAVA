import java.util.Scanner;

// public class UserInput {
//     public static void main(String[] args) {
//       Scanner scan =new Scanner(System.in);
//       System.out.print("Enter first number:");
//       int num1=scan.nextInt();
//       System.out.print("Enter Second number");
//       int num2=scan.nextInt();
//       System.out.println("Sum is:"+(num1+num2));  
//     }
// }

//Wap to take and input 2 para:

public class UserInput {
    public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      System.out.println("Enter Para 1:");
      String st1=scan.nextLine();
      System.out.println("Enter Para 2:");
      String st2=scan.nextLine();
      System.out.println(st1+" "+st2);
    }
}