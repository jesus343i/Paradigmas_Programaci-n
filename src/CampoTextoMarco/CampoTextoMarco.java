package CampoTextoMarco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampoTextoMarco extends JFrame {
    private final JTextField textField1; // text field with fixed size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField passwordField; // password field with text

    public CampoTextoMarco(){
        super("JTextField and JPasswordField test");
        setLayout(new FlowLayout());

        // build text field with 10 columns
        textField1 = new JTextField(10);
        add(textField1); // add textField1 to JFrame

        // build text field with default text
        textField2 = new JTextField("Type text here");
        add(textField1); // add textField2 to JFrame

        // build text field with default text and 21 columns
        textField3 = new JTextField("Non-editable text field", 21);
        textField3.setEditable(false);
        add(textField3); // add textField3 to JFrame

        // build password field with default text
        passwordField = new JPasswordField("Hidden text");
        add(passwordField); // add passwordField to JFrame

        // register event handlers
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        textField1.addActionListener(manejador);
        textField2.addActionListener(manejador);
        textField3.addActionListener(manejador);
        passwordField.addActionListener(manejador);
    }
    // private inner class for event handling
    private class ManejadorCampoTexto implements ActionListener{
        // process text field events
        @Override
        public void actionPerformed(ActionEvent evento){
            String cadena = "";

            // the user pressed Enter on the JTextField object textField1
            if (evento.getSource()== textField1)
                cadena = String.format("textField1: %s", evento.getActionCommand());

            // the user pressed Enter on the JTextField object textField2
            else if (evento.getSource() == textField2)
                cadena = String.format("textField2: %s", evento.getActionCommand());

            // the user pressed Enter on the JTextField object textField3
            else if (evento.getSource() == textField3)
                cadena = String.format("textField3: %s", evento.getActionCommand());

            // the user pressed Enter on the JTextField object passwordField
            else if (evento.getSource()== passwordField)
                cadena= String.format("passwordField: %s", evento.getActionCommand());

            // display the content of the JTextField object
            JOptionPane.showMessageDialog(null, cadena);
        }
    } // end private inner class TextFieldHandler
} // end class FrameTextField
