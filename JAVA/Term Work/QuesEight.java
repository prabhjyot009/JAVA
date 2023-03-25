//8.WAP in java to simulate condition to generate Wi-Fi password. Take input as Name, City, Age and Gender.
//Constraints:
//a.	Length of name and city should be greater or equal to 3.
//b.	Age can`t be 18.
//Output Constraints:
//a.	If Gender=F and Age<18
//Password: 1st 3 char of name + sum of digit of age + last 3 char of city
//b.	Else If gender=F and Age>18
//Password: last 3 char of Name + Diff of digit of age(Positive) + 1st 3 char of City.
//c.	Else
//Password: 1st char of name + 1st char of city + 2nd char of name + 2nd char of city …
//Append this to length of max string(name or city) and then concatenate with Age to get password.

import java.util.Scanner;

public class QuesEight {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    if (name.length() < 3) {
      System.out.println("Name must be at least 3 characters long.");
      return;
    }

    System.out.print("Enter city: ");
    String city = scanner.nextLine();
    if (city.length() < 3) {
      System.out.println("City must be at least 3 characters long.");
      return;
    }

    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    if (age == 18) {
      System.out.println("Age cannot be 18.");
      return;
    }

    System.out.print("Enter gender (M/F): ");
    char gender = scanner.next().charAt(0);

    String password = "";
    if (gender == 'F') {
      if (age < 18) {
        password = name.substring(0, 3) + sumOfDigits(age) + city.substring(city.length() - 3);
      } else {
        password = name.substring(name.length() - 3) + Math.abs(age) + city.substring(0, 3);
      }
    } else {
      int maxLength = Math.max(name.length(), city.length());
      for (int i = 0; i < maxLength; i++) {
        if (i < name.length()) {
          password += name.charAt(i);
        }
        if (i < city.length()) {
          password += city.charAt(i);
        }
      }
      password += age;
    }

    System.out.println("Your WiFi password is: " + password);
  }

  public static int sumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
