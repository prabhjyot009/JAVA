import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum = sum + (temp % 10) * (temp % 10) * (temp % 10);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}