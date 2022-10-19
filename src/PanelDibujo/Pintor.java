package PanelDibujo;

import javax.swing.*;
import java.awt.*;

public class Pintor {
    public static void main(String[] args) {
        // create object JFrame
        JFrame aplicacion = new JFrame("A simple drawing program");

        PanelDibujo panelDibujo = new PanelDibujo();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);


// create a label and place it in the SOUTH region of the BorderLayout
        aplicacion.add(new Label("Drag mouse to draw"),BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);

    }
}
