package Programs;

import java.util.Scanner;

public class CharInputFromUser {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please enter character input");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(3);
        System.out.println(ch);
    }
}
