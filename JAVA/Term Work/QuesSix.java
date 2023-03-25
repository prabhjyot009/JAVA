//6.WAP to show the use of Adapter classes in event driven application using Key board.

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class QuesSix {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Keyboard Adapter Example");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField();
    textField.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
      }
    });
    frame.add(textField);

    frame.setVisible(true);
  }
}
