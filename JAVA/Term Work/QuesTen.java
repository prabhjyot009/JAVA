//10.WAP in Java to initialize two string and find common characters and different Characters of these string.

public class QuesTen {
    public static void main(String[] args) {
      // Initialize two strings
      String str1 = "prabh singh";
      String str2 = "brar singh";
  
      // Find common characters
      for (int i = 0; i < str1.length(); i++) {
        char ch = str1.charAt(i);
        if (str2.indexOf(ch) != -1) {
          System.out.print(ch + " ");
        }
      }
      System.out.println();
  
      // Find different characters
      for (int i = 0; i < str1.length(); i++) {
        char ch = str1.charAt(i);
        if (str2.indexOf(ch) == -1) {
          System.out.print(ch + " ");
        }
      }
      System.out.println();

      for (int i = 0; i < str2.length(); i++) {
        char ch = str2.charAt(i);
        if (str1.indexOf(ch) == -1) {
          System.out.print(ch + " ");
        }
      }
    }
  }
  