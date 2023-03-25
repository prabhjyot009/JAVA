package Strings;
//Write a Java program to create a new String object with the contents of a character array.

public class StringobjectCharArr {
    public static void main(String[] args) {
        char[] arr_num = new char[] { '1', '2', '3', '4' };
        String str = String.copyValueOf(arr_num, 1, 3);
        System.out.println("\nThe book contains " + str +" pages.\n");
    }
}
