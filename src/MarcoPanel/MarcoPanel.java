package MarcoPanel;

import javax.swing.*;
import java.awt.*;

public class MarcoPanel extends JFrame {
    private final  JPanel panelBotones; // panel containing the buttons
    private final JButton[] botones;

    public MarcoPanel() {
        super("Panel of demo");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));

        // create and add the buttons
        for (int cuenta = 0; cuenta < botones.length; cuenta++){
            botones[cuenta] = new JButton("Button" + (cuenta +1));
            panelBotones.add(botones[cuenta]); // add the button to the panel
        }
        add(panelBotones, BorderLayout.SOUTH); // add the panel to JFrame
    }
} //end of the class MarcoPanel
