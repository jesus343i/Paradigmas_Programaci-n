package MarcoAreaTexto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoAreaTexto extends JFrame {
    private final JTextArea areaTexto1; // show demo string
    private final JTextArea areaTexto2; // the highlighted text is copied here
    private final JButton botonCopiar; // start copying text

    // constructor with no arguments
    public MarcoAreaTexto() {
        super("Demostracion de JTextArea");
        Box cuadro = Box.createHorizontalBox(); // create a frame
        String demo = "This is a string of\ndemo for\n" +
                "illustrate how to copy text\nfrom one text area to \n" + "other, wearing a\nexternal event\n";

        areaTexto1 = new JTextArea(demo, 10, 15);
        cuadro.add(new JScrollPane(areaTexto1)); // add scroll panel

        botonCopiar = new JButton("Copy >>>"); // create copy button
        cuadro.add(botonCopiar); // add copy button to box
        botonCopiar.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // set the text in textArea2 with the selected text from textArea1
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        areaTexto2.setText(areaTexto1.getSelectedText());
                    }
                }
        );

        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2)); // add scroll panel

        add(cuadro); // add frame to frame
    }
}
