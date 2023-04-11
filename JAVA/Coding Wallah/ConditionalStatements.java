// public class ConditionalStatements {
//     public static void main(String[] args) {
//         int num=5;
//         int result=num%2;
//         if(result==0){
//             System.out.println(num+" Is Even");
//         }
//         else{
//             System.out.println(num+" Is Odd");
//         }
//     }
// }
// import java.util.Scanner;
// //WAP to calculate grades:
// public class ConditionalStatements {
//     public static void main(String[] args) {
//         Scanner scan =new Scanner(System.in);
//         System.out.println("Enter marks:");
//         int Marks=scan.nextInt();

//         if(Marks>=90){
//             System.out.println("Grade A");
//         }
//         else if(Marks>=80 && Marks<=90){
//             System.out.println("Grade B");
//         }
//         else if(Marks>=70 && Marks<=80){
//             System.out.println("Grade C");
//         }
//         else if(Marks>=30 && Marks<=70){
//             System.out.println("Grade D");
//         }
//         else{
//             System.out.println("Grade F");
//         }
//     }
// }
//switch case:
import java.util.Scanner;

public class ConditionalStatements{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=scan.nextInt();
        System.out.print("Enter num2: ");
        int num2=scan.nextInt();

        System.out.println("+,-,*,/");
        char ch=scan.next().charAt(0);
        switch(ch){
            case '+':
            System.out.println("Add: "+(num1+num2));
            break;
            case '-':
            System.out.println("Sub: "+(num1-num2));
            break;
            case '*':
            System.out.println("Mul: "+(num1*num2));
            break;
            case '/':
            System.out.println("Div: "+(num1/num2));
            break;
            default:
            System.out.println("Invalid");
            break;
        }

    }
}