package MarcoBotonOpcion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoBotonOpcion extends JFrame {
    private final JTextField campoTexto; // is used to show the changes in the font
    private final Font tipoLetraSimple; // font for plain text
    private final Font tipoLetraNegrita; // font for bold text
    private final Font tipoLetraCursiva; // font for italic text
    private final Font tipoLetraNegritaCursiva; // font for text in bold and italic

    private final JRadioButton simpleJRadioButton; // select plain text
    private final JRadioButton negritaJRadioButton; // select bold text
    private final JRadioButton cursivaJRadioButton; // select italic text
    private final JRadioButton negritaCursivaJRadioButton; // bold and italic
    private ButtonGroup grupoOpciones; // contains the radio buttons

    public MarcoBotonOpcion() {
        super("Test of RadioButton");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Notice the change in the font style", 25);
        add(campoTexto); // agrega campoTexto a JFrame

        // crea los botones de opción
        simpleJRadioButton = new JRadioButton("Simple", true);
        negritaJRadioButton = new JRadioButton("Bold", false);
        cursivaJRadioButton = new JRadioButton("Italics", false);
        negritaCursivaJRadioButton = new JRadioButton("Bold/Italic", false);
        add(simpleJRadioButton); // add simple button to JFrame
        add(negritaJRadioButton); // add bold button to JFrame
        add(cursivaJRadioButton); // add italics button to JFrame
        add(negritaCursivaJRadioButton); // add bold and italic button

        // create a logical relationship between the JRadioButton objects
        grupoOpciones = new ButtonGroup(); // create ButtonGroup
        grupoOpciones.add(simpleJRadioButton); // add simple to the group
        grupoOpciones.add(negritaJRadioButton); // add bold to the group
        grupoOpciones.add(cursivaJRadioButton); // add italics to the group
        grupoOpciones.add(negritaCursivaJRadioButton); // add bold and italics

        // create font objects
        tipoLetraSimple = new Font("Serif", Font.PLAIN, 14);
        tipoLetraNegrita = new Font("Serif", Font.BOLD, 14);
        tipoLetraCursiva = new Font("Serif", Font.ITALIC, 14);
        tipoLetraNegritaCursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        campoTexto.setFont(tipoLetraSimple);

        // register events for JRadioButton objects
        simpleJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
    }


    private class ManejadorBotonOpcion implements ItemListener {
        private Font tipoLetra; // font associated with this component listening

        public ManejadorBotonOpcion(Font f) {
            tipoLetra = f;
        }

        // handle radio button events
        @Override
        public void itemStateChanged(ItemEvent evento) {
            campoTexto.setFont(tipoLetra);
        }
    }
} // end class OptionButtonFrame
