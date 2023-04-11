import java.util.Scanner;

//A+B A+2B A+3B
// public class Series {
//     public static void main(String[] args) {
//         Scanner scan =new Scanner(System.in);
//         int A=scan.nextInt();
//         int B=scan.nextInt();
        
//         A+=B;
//         System.out.println(A);
//         A+=B;
//         System.out.println(A);        
//         A+=B;
//         System.out.println(A);        
//     }
// }
//A-B A-2B A-4B
public class Series {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        
        A-=B;
        System.out.println(A);
        A-=B;
        System.out.println(A);        
        A-=B;
        System.out.println(A);        
    }
}