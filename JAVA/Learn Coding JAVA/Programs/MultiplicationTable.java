 import java.util.Scanner;
 public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number:");
        Scanner ref=new Scanner(System.in);
        num=ref.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}

