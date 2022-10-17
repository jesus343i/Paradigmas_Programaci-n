package MarcoLista;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MarcoLista extends JFrame {
    private final JList<String> listaJListColores; // list to display colors
    private static final String[] nombreColores = {"Black", "Blue", "Cyan",
    "Dark gray", "Gray", "Green", "Light grey", "Magenta",
    "Orange", "Pink", "Red", "White", "Yelow"};
    private static final Color[] colores = {Color.BLACK, Color.BLUE,
    Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
    Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
    Color.RED, Color.WHITE, Color.YELLOW};

    // The constructor of ListFrame adds to the JFrame the JScrollPane that contains a JList
    public  MarcoLista() {
        setLayout(new FlowLayout());

        listaJListColores = new JList<>(nombreColores); // list of nameColors
        listaJListColores.setVisibleRowCount(5); // show five rows at a time

        // does not allow multiple selections
        listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add a JScrollPane object containing the JList to the frame
        add(new JScrollPane(listaJListColores));

        listaJListColores.addListSelectionListener(new ListSelectionListener(){
            // handle list selection events
            @Override
            public void valueChanged(ListSelectionEvent evento){
                getContentPane().setBackground(colores[listaJListColores.getSelectedIndex()]);
            }
        }
        );
    }
} // end class ListFrame
