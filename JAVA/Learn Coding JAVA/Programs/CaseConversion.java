import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        char ch, ch2;
        System.out.println("Enter characters: ");
        Scanner ref = new Scanner(System.in);
        ch = ref.next().charAt(1);
        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lowercase: " + ch2);
        } else {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase: " + ch2);
        }
    }
}
