//13.	WAP in Java of JDBC to insert data using procedure and CallableStatement in a table in oracle.*/

import java.sql.*;
import java.util.Scanner;

public class QuesThirteen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name: ");
    String name = scanner.nextLine();
    System.out.print("Enter the age: ");
    int age = scanner.nextInt();
    scanner.close();

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","singh009");
      CallableStatement callableStatement = connection.prepareCall("{call insertData(?, ?)}");
      callableStatement.setString(1, name);
      callableStatement.setInt(2, age);
      callableStatement.execute();
      connection.close();
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
