package com.mycompany.joption2;

import javax.swing.JOptionPane;

public class JOption2 {

    public static void main(String[] args) {
        
        // Input first and second numbers
        String num1 = JOptionPane.showInputDialog(null, "Input 1st number");
        int a = Integer.parseInt(num1);
       
        String num2 = JOptionPane.showInputDialog(null, "Input 2nd number");
        int b = Integer.parseInt(num2);
         
        while (true) {
            // Display menu
            String menu = "====== Menu =======\n"
                          + "1. Addition\n"
                          + "2. Subtraction\n"
                          + "3. Division\n"
                          + "4. Multiplication\n"
                          + "0. Exit";           
            
            String choice = JOptionPane.showInputDialog(menu);            
    
            switch (choice) {
                case "1": 
                    JOptionPane.showMessageDialog(null, "The sum of " + a + " & " + b + " is " + (a + b));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "The difference of " + a + " & " + b + " is " + (a - b));
                    break;
                case "3":
                    if (b != 0) {
                        JOptionPane.showMessageDialog(null, "The quotient of " + a + " & " + b + " is " + (a / b));
                    } else {
                        JOptionPane.showMessageDialog(null, "Division by zero is not allowed!");
                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "The product of " + a + " & " + b + "is" + (a * b));
                    break;
                case "0": 
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please select a valid option.");
                    break;
            }
        }
    }
}
