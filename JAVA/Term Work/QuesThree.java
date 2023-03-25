//
import java.util.Scanner;

public class QuesThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // ask the user to enter the number of rows
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    
    // create a 2D array with the given number of rows
    int[][] array = new int[rows][];
    
    // ask the user to enter the values for each row
    for (int i = 0; i < rows; i++) {
      // ask the user to enter the number of columns in the row
      System.out.print("Enter the number of columns in row " + (i+1) + ": ");
      int cols = sc.nextInt();
      
      // create an array for the row with the given number of columns
      array[i] = new int[cols];
      
      // ask the user to enter the values for the row
      System.out.print("Enter the values for row " + (i+1) + ": ");
      for (int j = 0; j < cols; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    
    // print the average of each row
    for (int i = 0; i < rows; i++) {
      int sum = 0; // variable to store the sum of the values in the row
      for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
      }
      double average = (double) sum / array[i].length; // calculate the average
      System.out.println("Average of row " + (i+1) + ": " + average);
    }
  }
}

