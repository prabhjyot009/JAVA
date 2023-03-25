package Strings;
//Write a Java program to convert all the characters in a string to uppercase.

public class Uppercase {
    public static void main(String[] args) {
        String str = "The Quick BroWn FoX!";

        // Convert the above string to all uppercase.
        String upper_str = str.toUpperCase();

        // Display the two strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upper_str);
    }
}
