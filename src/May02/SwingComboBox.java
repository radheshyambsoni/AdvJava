package May02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingComboBox {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JComboBox");
        jf.setSize(400, 400);
        Container c=jf.getContentPane();
        c.setLayout(new FlowLayout());
        jf.setVisible(true);

        String[] colors={"Red","Green","Yellow"};
        JComboBox<String> jcb=new JComboBox<>(colors);
        c.add(jcb);
        JLabel jl=new JLabel();
        c.add(jl);
        jcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                jl.setText("Selected: "+jcb.getSelectedItem());
            }
        });
    }
}