//9.WAP in Java to take input (more than one) using command line and compare it with input taken using Scanner. If there is any match, print “Character Found” else throw a NoMatchException (also message).
import java.util.Scanner;

public class QuesNine {
  public static void main(String[] args)throws Exception {
    // Check if there are any command-line arguments
    if (args.length == 2) {
      System.out.println("No command-line arguments provided.");
      return;
    }

    // Take input using a Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    // Compare input with command-line arguments
    for (String s : args) {
      if (s.equals(input)) {
        System.out.println("Character found.");
        return;
      }
    }
  
    
    // Throw an exception if no match is found
    throw new NoMatchException("No match found.");
  }
}

// Custom exception class
class NoMatchException extends Exception {
  public NoMatchException(String message) {
    super(message);
  }
}
