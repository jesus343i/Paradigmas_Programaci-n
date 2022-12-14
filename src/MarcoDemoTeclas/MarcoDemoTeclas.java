package MarcoDemoTeclas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MarcoDemoTeclas extends JFrame implements KeyListener {
    private String linea1 = ""; // first line of the text area
    private String linea2 = ""; // second line of the text area
    private String linea3 = ""; // third line of the text area
    private JTextArea areaTexto; // text area to display the output

    // constructor de MarcoDemoTeclas
    public MarcoDemoTeclas() {
        super("Demonstration of key press events");

        areaTexto = new JTextArea(10, 15); // sets the JTextArea object
        areaTexto.setText("Press any key on the keyboard...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.BLACK);
        add(areaTexto); // add the textarea to JFrame

        addKeyListener(this); // allows the framework to process key events
    }

    // handle the event of pressing any key
    @Override
    public void keyPressed(KeyEvent evento) {
        linea1 = String.format("Key pressed: %s",
                KeyEvent.getKeyText(evento.getKeyCode())); // show the key pressed
        establecerLineas2y3(evento); // set output lines two and three
    }

    // handle the event of releasing any key
    @Override
    public void keyReleased(KeyEvent evento) {
        linea1 = String.format("Key released: %s",
                KeyEvent.getKeyText(evento.getKeyCode())); // show the released key
        establecerLineas2y3(evento); // set output lines two and three
    }

    // handle the event of pressing an action key
    @Override
    public void keyTyped(KeyEvent evento) {
        linea1 = String.format("Key pressed: %s", evento.getKeyChar());
        establecerLineas2y3(evento); // set output lines two and three
    }

    // sets output lines two and three
    private void establecerLineas2y3(KeyEvent evento) {
        linea2 = String.format("This key %s is an action key",
                (evento.isActionKey() ? "" : "no"));

        String temp = KeyEvent.getKeyModifiersText(evento.getModifiers());

        linea3 = String.format("Modifier keys pressed: %s",
                (temp.equals("") ? "ninguna" : temp)); // prints modifiers

        areaTexto.setText(String.format("%s\n%s\n",
                linea1, linea2, linea3)); // print three lines of text
    }
}
