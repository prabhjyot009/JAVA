//2.	WAP in Java to print the sum of following series:x1/y2 + x3/y4 + x5/y6 + …. Upto n terms.


public class QuesTwo {
  public static void main(String[] args) {
    int n = 10; // number of terms
    int x = 2; // value of x
    int y = 3; // value of y
    double sum = 0.0; // variable to store the sum
    
    for (int i = 1; i <= n; i++) {
      // calculate the value of xi and yi
      int xi = x * (2 * i - 1);
      int yi = y * (2 * i);
      
      // add the term xi/yi to the sum
      sum += (double) xi / yi;
    }
    
    // print the sum
    System.out.println("Sum = " + sum);
  }
}