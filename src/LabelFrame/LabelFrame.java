package LabelFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LabelFrame extends JFrame {
    private JLabel etiqueta1; // JLabel with text only
    private JLabel etiqueta2; // JLabel built with text and an icon
    private JLabel etiqueta3; // JLabel with additional text and icon

    // LabelFrame constructor adds JLabel objects to JFrame
    public LabelFrame() {
        super("JLabel Test");
        setLayout(new FlowLayout()); // set the frame schema

        // JLabel constructor with a String argument
        etiqueta1 = new JLabel("Label with text");
        etiqueta1.setToolTipText("This is label1");
        add(etiqueta1); // add label1 to JFrame

        // JLabel constructor with string, Icon, and alignment arguments
        Icon insecto = new ImageIcon(Objects.requireNonNull(getClass().getResource("insecto1.png")));
        etiqueta2 = new JLabel("Label with text and icon", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("This is label2");
        add(etiqueta2); // add tag2 to JFrame

        etiqueta3 = new JLabel(); // JLabel constructor with no arguments
        etiqueta3.setText("Label with icon and text at the bottom");
        etiqueta3.setIcon(insecto); // add icon to JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("This is label3");
        add(etiqueta3); // add tag3 to JFrame
    }
}// end LabelFrame class
