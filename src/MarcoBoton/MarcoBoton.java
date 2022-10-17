package MarcoBoton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; // button with text only
    private final JButton botonJButtonElegante; // button with icons

    // ButtonFrame adds JButton objects to JFrame
    public MarcoBoton() {
        super("Button test");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Single button"); // button with text
        add(botonJButtonSimple); // add buttonJButtonSimple to JFrame

        Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
        Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
        botonJButtonElegante = new JButton("Elegant button", insecto1); // set the image
        botonJButtonElegante.setRolloverIcon(insecto2); // set the replacement image
        add(botonJButtonElegante); // add fancyButtonJButton to JFrame

        // create new ButtonHandler to handle button events
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    // create new ButtonHandler to handle button events
    private class ManejadorBoton implements ActionListener {
        // handle button event
        @Override
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format(
                    "You oppressed: %s", evento.getActionCommand()));
        }
    }
} // end the ButtonFrame class
