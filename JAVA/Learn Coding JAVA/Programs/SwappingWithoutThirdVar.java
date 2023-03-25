 import java.util.Scanner;
    public class SwappingWithoutThirdVar {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter number:");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();//100
        b=ref.nextInt();//200
        System.out.println("Before Swapping:"+a+" "+b);//100   200
        a=a+b; //100+200=300
        b=a-b; //300-200=100;
        a=a-b; //300-100=200;
        System.out.println("After Swapping:"+a+" "+b);//200   100
    }
}

