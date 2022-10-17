package MarcoDetallesRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MarcoDetallesRaton extends JFrame {
    private String detalles; // String displayed in StatusBar
    private final JLabel barraEstado; // JLabel that appears at the bottom of the window

    // constructor sets String of title bar and registers mouse listener component
    public MarcoDetallesRaton() {
        super("Clicks and mouse buttons");

        barraEstado = new JLabel("Click on the mouse");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton()); // add the manejador
    }

    // inner class to handle mouse events
    private class ManejadorClicRaton extends MouseAdapter {
        // handle mouse click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent evento) {
            int xPos = evento.getX(); // get mouse position x
            int yPos = evento.getY(); // get mouse y position

            detalles = String.format("Was clicked %d vez(veces)", evento.getClickCount());

            if (evento.isMetaDown()) // botón derecho del ratón
                detalles += " with the right mouse button";
            else if (evento.isAltDown()) // botón central del ratón
                detalles += " with the middle mouse button";
            else // botón izquierdo del ratón
                detalles += " with the left mouse button";

            barraEstado.setText(detalles); // muestra mensaje en barraEstado
        }
    }
}
