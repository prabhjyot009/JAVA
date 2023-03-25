//20.WAP to show the working of cardlayout in a quiz application.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuesTwenty {
  public static void main(String[] args) {
    // Create a frame to hold the quiz
    JFrame frame = new JFrame("Quiz Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a panel to hold the cards
    JPanel cardPanel = new JPanel();
    cardPanel.setLayout(new CardLayout());

    // Create a panel for each question and add it to the card panel
    JPanel question1Panel = new JPanel();
    question1Panel.add(new JLabel("Question 1: What is the capital of France?"));
    question1Panel.add(new JRadioButton("Paris"));
    question1Panel.add(new JRadioButton("London"));
    question1Panel.add(new JRadioButton("Berlin"));
    cardPanel.add(question1Panel, "Question 1");

    JPanel question2Panel = new JPanel();
    question2Panel.add(new JLabel("Question 2: What is the largest planet in the solar system?"));
    question2Panel.add(new JRadioButton("Earth"));
    question2Panel.add(new JRadioButton("Jupiter"));
    question2Panel.add(new JRadioButton("Saturn"));
    cardPanel.add(question2Panel, "Question 2");

    // Add the card panel to the frame
    frame.add(cardPanel);

    // Add buttons to navigate between the cards
    JPanel buttonPanel = new JPanel();
    JButton previousButton = new JButton("Previous");
    previousButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.previous(cardPanel);
      }
    });
    buttonPanel.add(previousButton);
    JButton nextButton = new JButton("Next");
    nextButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.next(cardPanel);
      }
    });
    buttonPanel.add(nextButton);
    frame.add(buttonPanel, BorderLayout.SOUTH);

    // Show the frame
    frame.pack();
    frame.setVisible(true);
  }
}
