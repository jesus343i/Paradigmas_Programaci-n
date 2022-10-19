package MarcoBoderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoBorderLayout extends JFrame implements ActionListener {
    private final JButton botones[]; // array of buttons to hide portions
    private static final String nombres[] = {"Hide North", "Hide South",
            "Hide East", "Hise west", "Hide Center"};
    private final BorderLayout esquema;

    // establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
        super("BorderLayout demo");

        esquema = new BorderLayout(5, 5); // 5 pixel spaces
        setLayout(esquema);
        botones = new JButton[nombres.length];

        // create JButton objects and register listeners for them
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }

        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }

    // handle button events
    @Override
    public void actionPerformed(ActionEvent evento) {
        // check the event source and dispatch the content pane accordingly
        for (JButton boton : botones) {
            if (evento.getSource() == boton)
                boton.setVisible(false); // hide the clicked button
            else
                boton.setVisible(true); // show the other buttons
        }

        esquema.layoutContainer(getContentPane()); // layout the content pane
    }
}
