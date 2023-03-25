
/*import java.awt.Frame;

public class a {

   public static void main (String args[]) {
      System.out.println("1");
      //Calling the constructor of the Frame class
      Frame frame = new Frame();
      frame.setVisible(true);
      frame.setSize(300, 300);
      System.out.println("2");
      System.out.println(frame);
   }
}*/
import java.awt.Frame;
import java.awt.Color;

class a {
   public static void main(String[] args) {
      Frame f = new Frame();
      f.setSize(600, 500);
      f.setVisible(true);
      // a.setLocation(50,100);
      // a.setBounds(500, 200, 600, 500);
      f.setBackground(Color.blue);
      f.resize(900, 500);
   }
}