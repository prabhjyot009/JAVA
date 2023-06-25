import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        //is digit is special character is string or not using user input
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter a character");
            char ch = sc.next().charAt(0);
            if(Character.isDigit(ch)){
                System.out.println("Digit");
            }
            else if(Character.isLetter(ch)){
                System.out.println("Letter");
            }
            else{
                System.out.println("Special Character");
            }
    }
}
