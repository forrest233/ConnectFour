/**
 * Connect Four Java
 * GUI version of Connect Four
 * Zaid Omer
 * Forrest Yuan
 * Dec. 18, 2017
 */

import java.io.*; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class connectFour extends JFrame implements ActionListener {
  
  JButton okButton = new JButton ("OK");
  
  JLabel player1Label = new JLabel("Player 1:", JLabel.RIGHT);
  JLabel player2Label = new JLabel("Player 2:", JLabel.RIGHT);
  
  JLabel nameInstructions = new JLabel("Please enter your names", JLabel.RIGHT);
  
  JPanel pan1 = new JPanel(); 
  JPanel pan2 = new JPanel();
  
  JTextField player1Name = new JTextField(20);
  JTextField player2Name = new JTextField(20);
  
  public connectFour()
  {

    setTitle ("Connect Four");
    setSize (1750, 800);
    
    GridLayout frame = new GridLayout();
    setLayout (frame);
    
    
    //-------- Set up the Panel 1 ----------------------------
    BoxLayout box1 = new BoxLayout(pan1, BoxLayout.Y_AXIS);
    pan1.setLayout (box1);
    
    okButton.addActionListener(this);
    
    
    pan1.add(player1Label);
    pan1.add(player1Name);
    pan1.add(player2Label);
    pan1.add(player2Name);
    pan1.add(okButton); 
    pan1.add(nameInstructions);
    
    
    
    
    
    add(pan1);
    add(pan2);
    
    
    //------- set the Frame so the user can see it --------------
    setVisible(true); 
    
    
  }
  
  
  
  public void actionPerformed(ActionEvent event)
  {
    
    
    
    
    
  }
  
  
  public static void main(String[] args)throws Exception {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to the Connect Four Game!");
    
    
    
    
    
    new connectFour();
    
    input.close();
  }
  
}
