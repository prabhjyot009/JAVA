//1.	WAP in Java to print the sum of following series:xn = x1 + x2 + x3 + x4 + …… + xn.

import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the series: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of x1: ");
        int x1 = scanner.nextInt();

        int sum = x1;
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter the value of x" + i + ": ");
            int xi = scanner.nextInt();
            sum += xi;
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
