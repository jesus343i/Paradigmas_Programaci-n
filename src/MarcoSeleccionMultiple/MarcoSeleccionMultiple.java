package MarcoSeleccionMultiple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoSeleccionMultiple extends JFrame {
    private final JList<String> listaJListColores; // list to store names of the colors
    private final JList<String> listaJListCopia; // list to copy to the names of the colors

    private JButton botonJbuttonCopiar; // button to copy selected names
    private static final String[] nombresColores = {"Black", "Blue", "Cyan",
            "Dark gray", "Gray", "Green", "Light grey", "Magenta",
            "Orange", "Pink", "Red", "White", "Yelow"};

    // Constructor of MultipleSelectionFrame
    public MarcoSeleccionMultiple(){
        super("List of multiple selection");
        setLayout(new FlowLayout());

        listaJListColores = new JList<String>(nombresColores); // list of names of colors
        listaJListColores.setVisibleRowCount(5); // show five rows
        listaJListColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListColores)); // add list with panel displacement

        botonJbuttonCopiar = new JButton("Copiar>>>");
        botonJbuttonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                // put the selected values in listJListCopy
                listaJListCopia.setListData(listaJListColores.getSelectedValuesList().toArray(new String[0]));
            }
        }
        );

        add(botonJbuttonCopiar); //add copy button to JFrame

        listaJListCopia = new JList<String>(); // list to save copied color names
        listaJListCopia.setVisibleRowCount(5); // show 5 rows
        listaJListCopia.setFixedCellWidth(100); // set the width
        listaJListCopia.setFixedCellHeight(15); // set the height
        listaJListCopia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListCopia)); // add list with panel displacement
    }
} // end class MultiSelectionFrame
