//19.WAP to check whether a file having your name. If yes then copy your name’s all occurrence in new file by creating it.

import java.io.*;

public class QuesNineteen {
  public static void main(String[] args) {
    String name = "Prabhjyot Singh";

    String inputFileName = "input.txt";
    String outputFileName = "output.txt";

    try {
      BufferedReader inputFile = new BufferedReader(new FileReader(inputFileName));
      BufferedWriter outputFile = new BufferedWriter(new FileWriter(outputFileName));
      String line;
      while ((line = inputFile.readLine()) != null) {
        if (line.contains(name)) {
          outputFile.write(line);
          outputFile.newLine();
        }
      }

      inputFile.close();
      outputFile.close();
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
