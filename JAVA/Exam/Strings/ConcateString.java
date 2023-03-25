package Strings;
//Write a Java program to concatenate a given string to the end of another string.

public class ConcateString {
    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string: " + str3);
    }
}
