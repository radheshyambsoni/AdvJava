package May02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingTextFieldNPwd {
    public static void main(String[] args) {
        // Java Swing
        // Useful for GUI
        // better than Swing
        // not a substitute for AWT

        JFrame jf=new JFrame("JTextField");
        Container c=jf.getContentPane(); //Components are added to content pane
        jf.setSize(200, 200);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Name"));
        c.add(new JTextField(10));
        jf.setVisible(true);
        
        JPasswordField jpf=new JPasswordField(10); // doesn't require setEchoChar, shows 'dot' for each character by default
        c.add(new JLabel("Password "));
        c.add(jpf);
        jpf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String pwd=new String(jpf.getPassword());
                JOptionPane.showMessageDialog(jf, "password is: "+ pwd);
            }
        });
    }
}