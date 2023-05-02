package May02;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        // Java Swing
        // Useful for GUI
        // better than Swing
        // not a substitute for AWT

        JFrame jf=new JFrame("JTextField Example");
        Container c=jf.getContentPane();
        jf.setSize(200, 90);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Name"));
        c.add(new JTextField(10));
        jf.setVisible(true);
    }
}