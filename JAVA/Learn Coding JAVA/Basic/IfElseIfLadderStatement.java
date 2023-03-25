import java.util.Scanner;

public class IfElseIfLadderStatement {
    public static void main(String[] args) {
        int marks;
        System.out.println("Total number of marks are:");
        Scanner ref=new Scanner(System.in);
        marks=ref.nextInt();

        if(marks>80)
        {
            System.out.println("Topper");
        }
        else if(marks<80 && marks>=60)
        {
            System.out.println("Second");
        }
        else
        {
            System.out.println("Third");
        }
    }
}
