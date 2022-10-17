package MarcoCuadroCombinado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoCuadroCombinado extends JFrame
{
    private final JComboBox<String> imagenesJComboBox; // contiene los nombres de los iconos
    private final JLabel etiqueta; // muestra el icono seleccionado

    private static final String nombres[] = {"insecto1.gif", "insecto2.gif", "insectviaje.gif", "insectanim.gif"};
private final Icon[] iconos = {
        new ImageIcon(getClass().getResource(nombres[0])),
        new ImageIcon(getClass().getResource(nombres[1])),
        new ImageIcon(getClass().getResource(nombres[2])),
        new ImageIcon(getClass().getResource(nombres[3]))};

    // ComboBoxFrame constructor adds a JComboBox object to JFrame
public MarcoCuadroCombinado()
        {
        super("Test of JComboBox");
        setLayout(new FlowLayout()); // set the frame schema

        imagenesJComboBox = new JComboBox<String>(nombres); // set JComboBox
        imagenesJComboBox.setMaximumRowCount(3); // show three rows

        imagenesJComboBox.addItemListener(new ItemListener() // anonymous inner class
        {
            // handle JComboBox event
            @Override
            public void itemStateChanged(ItemEvent evento)
        {
            // determine if the element is selected
        if (evento.getStateChange() == ItemEvent.SELECTED)
           etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
        }
        } // end anonymous inner class
        ); // end addItemListener call
        add(imagenesJComboBox); // add combobox to JFrame
        etiqueta = new JLabel(iconos[0]); // show the first icon
        add(etiqueta); // add label to JFrame
        }
} // end class CombinedFrame