import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] + nums[i + 1] == target) {
                System.out.println("[" + i + "," + (i + 1) + "]");
            }
        }

    }
}