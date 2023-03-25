//7.WAP in Java to count number of occurrence of character which occurred most in user-inputted string.

import java.util.Scanner;

public class QuesSeven {
  public static void main(String[] args) {
    // Prompt the user to enter a string
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = sc.nextLine();

    // Initialize an array to store the character counts
    int[] charCounts = new int[128];

    // Iterate through the characters in the string and increment the count for each character in the array
    for (char c : s.toCharArray()) {
      charCounts[(int) c]++;
    }

    // Initialize a variable to store the maximum count of any character
    int maxCount = 0;

    // Iterate through the array and update maxCount to the count of the current character if it is greater than the current value of maxCount
    for (int i = 0; i < charCounts.length; i++) {
      int count = charCounts[i];
      if (count > maxCount) {
        maxCount = count;
      }
    }

    // Print the number of occurrences of the character with the maximum count
    System.out.println("The character that occurs the most has " + maxCount + " occurrences.");
  }
}
