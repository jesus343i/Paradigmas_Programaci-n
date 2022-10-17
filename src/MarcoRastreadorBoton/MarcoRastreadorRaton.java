package MarcoRastreadorBoton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MarcoRastreadorRaton extends JFrame {
    private final JPanel panelRaton; // panel in which the mouse events will occur
    private final JLabel barraEstado; // display event information

    // The MouseTrackerFrame constructor sets up the GUI and register mouse event handlers
    public MarcoRastreadorRaton() {
        super("Demonstration of mouse events");

        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER); // add panel to JFrame

        barraEstado = new JLabel("Mouse out of JPanel");
        add(barraEstado, BorderLayout.SOUTH); // add label to JFrame

        // create and register a listener for mouse and mouse movement events
        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {
        // The MouseListener event handlers
        // handle the event when the mouse is released right after the button is pressed
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Clicked on [%d, %d]",
                    evento.getX(), evento.getY()));
        }

        // handle event when mouse is pressed
        @Override
        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("Was pressed into [%d, %d]",
                    evento.getX(), evento.getY()));
        }

        // handle event when mouse button is released
        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("got loose on [%d, %d]",
                    evento.getX(), evento.getY()));
        }

        // handle event when mouse enters area
        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("Mouse entered [%d, %d]",
                    evento.getX(), evento.getY()));
            panelRaton.setBackground(Color.GREEN);
        }

        // handle event when mouse leaves area
        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Mouse out of JPanel");
            panelRaton.setBackground(Color.WHITE);
        }

        // MouseMotionListener event handlers handle
        // the event when the user drags the mouse with the button pressed
        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Crawled in [%d, %d]",
                    evento.getX(), evento.getY()));
        }

        // handle event when user moves mouse
        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Moved in [%d, %d]",
                    evento.getX(), evento.getY()));
        }
    } // end of the class interna ManejadorRaton
}
