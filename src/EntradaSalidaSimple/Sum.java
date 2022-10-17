package EntradaSalidaSimple;

import javax.swing.*;

public class Sum {
    public static void main(String[] args) {
        // get user input from JOptionPane input dialogs
        String firstNumber = JOptionPane.showInputDialog("Enter the first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter the second integer");

        // convert string inputs to int values to use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        // display the results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + sum,
                "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
} // end of class Sum
