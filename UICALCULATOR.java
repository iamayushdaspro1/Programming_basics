/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.calculator;

/**
 *
 * @author shubhendu
 */
import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;
public class UICALCULATOR extends Frame implements ActionListener {

     TextField tfInput;
 Panel panel;
 
 String btnString[] = {"7", "8", "9", "+",
                 "4", "5", "6", "-",
                 "1", "2", "3", "*",
                 "C", "0", "=", "/"};
 Button btn[] = new Button[16];   
 int num1 = 0, num2 = 0, result = 0;
 char op;
 
 public UICALCULATOR() {
 
  
  tfInput = new TextField(10);
  
  
  panel = new Panel();
  
  add(tfInput, "North");
  add(panel, "Center");
  
  panel.setLayout(new GridLayout(4,4));
  
  for(int i=0; i < 16; i++) {
   
   btn[i] = new Button(btnString[i]);
   
   btn[i].addActionListener(this);
   panel.add(btn[i]);
  }
  
  addWindowListener(new WindowAdapter(){
   
   public void windowClosing(WindowEvent we) {
    System.exit(0);
   }
  });
 }
 
 public void actionPerformed(ActionEvent ae) {
  
  String str = ae.getActionCommand();
  
  if(str.equals("+")) {
   
   op = '+';
   num1 = Integer.parseInt(tfInput.getText());
   tfInput.setText("");
  }
  else if(str.equals("-")) {
   op = '-';
   num1 = Integer.parseInt(tfInput.getText());
   tfInput.setText("");
  }
  else if(str.equals("*")) {
   op = '*';
   num1 = Integer.parseInt(tfInput.getText());
   tfInput.setText("");
  }
  else if(str.equals("/")) {
   op = '/';
   num1 = Integer.parseInt(tfInput.getText());
   tfInput.setText("");
  }
  else if(str.equals("=")) {
   
   num2 = Integer.parseInt(tfInput.getText());
   
   switch(op) {
    
    case '+' : result = num1 + num2;
     break;
    case '-' : result = num1 - num2;
     break;
    case '*' : result = num1 * num2;
     break;
    case '/' : result = num1 / num2;
     break;
   }
   tfInput.setText(result + "");
   result = 0;
  }
  else if(str.equals("C")) {
   
   tfInput.setText("");
   num1 = num2 = result = 0;
  }
  else {
   tfInput.setText(tfInput.getText() + str);
  }
 }
 
 public static void main(String args[]) {
  
  UICALCULATOR m = new UICALCULATOR ();
  m.setTitle("My Calculator");
  m.setSize(250,300);
  m.setVisible(true);
 }
}