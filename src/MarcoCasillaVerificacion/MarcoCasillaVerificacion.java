package MarcoCasillaVerificacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoCasillaVerificacion extends JFrame {
    private JTextField campoTexto; // display the text in fonts changeable
    private JCheckBox negritaJCheckBox; // to select/deselect bold
    private JCheckBox cursivaJCheckBox; // to select/deselect italics

    // The constructor of CheckBoxFrame adds JCheckBox objects to JFrame
    public MarcoCasillaVerificacion(){
        super("Test of JCheckBox");
        setLayout(new FlowLayout());

        // set JTextField and its font
        campoTexto = new JTextField("Notice how the font style changes lyrics", 20);
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(campoTexto); // add TextField to JFrame

        negritaJCheckBox = new JCheckBox("Bold font");
        cursivaJCheckBox = new JCheckBox("Italics");
        add(negritaJCheckBox); // add "bold" checkbox to JFrame
        add(cursivaJCheckBox); // add "italic" checkbox to JFrame

        // register listener components for JCheckBox objects
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }

    // private inner class for handling ItemListener events
    private class ManejadorCheckBox implements ItemListener{
        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent evento){
            Font tipoLetra = null; // stores the new Font object

            // determine which CheckBox objects are selected and create the Font object
            if(negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected())
                tipoLetra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (negritaJCheckBox.isSelected())
                tipoLetra = new Font("Serif", Font.BOLD, 14);
            else if (cursivaJCheckBox.isSelected())
                tipoLetra = new Font("Serif", Font.ITALIC, 14);
            else
                tipoLetra = new Font("Serif", Font.PLAIN, 14);

            campoTexto.setFont(tipoLetra);
        }
    } // end class CheckBoxFrame
}
