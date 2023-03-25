// 4.WAP in Java to create a menu-driven program to perform Stack operation.

import java.util.Scanner;
import java.util.Stack;

public class QuesFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
      // display the menu
      System.out.println("\nMenu:");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Peek");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // push
                    System.out.print("Enter a value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed to stack");
                    break;
                case 2: // pop
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        int poppedValue = stack.pop();
                        System.out.println(poppedValue + " popped from stack");
                    }
                    break;
                case 3: // peek
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        int topValue = stack.peek();
                        System.out.println("Top value: " + topValue);
                    }
                    break;
                case 4: // exit
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}