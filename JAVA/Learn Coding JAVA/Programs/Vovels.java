import java.util.Scanner;

public class Vovels {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter Character:");
        Scanner ref=new Scanner(System.in);
        ch=ref.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Vovels");
        }
        else{
            System.out.println("Not Vovels");
        }
    }    
}
