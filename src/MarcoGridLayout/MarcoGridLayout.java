package MarcoGridLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoGridLayout extends JFrame implements ActionListener {
    private final JButton[] botones; // array of buttons
    private static final String[] nombres =
            { "one", "two", "three", "for", "five", "six" };
private boolean alternar = true; // toggles between two schemes
private Container contenedor; // frame container
private GridLayout cuadricula1; // first GridLayout object
private GridLayout cuadricula2; // second GridLayout object

    // constructor with no arguments
public MarcoGridLayout()
        {
        super("GridLayout demo");
        cuadricula1 = new GridLayout(2, 3, 5, 5); // 2 by 3; spaces of 5
        cuadricula2 = new GridLayout(3, 2); // 3 for 2; no spaces
        contenedor = getContentPane();
        setLayout(cuadricula1);
        botones = new JButton[nombres.length];

        for (int cuenta = 0; cuenta < nombres.length; cuenta++)
        {
        botones[cuenta] = new JButton(nombres[cuenta]);
        botones[cuenta].addActionListener(this); // register listener component
        add(botones[cuenta]); // add button to JFrame object
        }
        }

    // handle button events, toggling between schemes
@Override
public void actionPerformed(ActionEvent evento)
        {
        if (alternar) // set schema based on toggle
            contenedor.setLayout(cuadricula2);
        else
            contenedor.setLayout(cuadricula1);

        alternar = !alternar;
        contenedor.validate(); // redistribute the container
        }
}
