package May03;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class SwingJList{
    public static void main(String[] args) {
        JFrame jf=new JFrame("Jlist");
        Container c=jf.getContentPane();
        c.setLayout(new FlowLayout());
        String[] langs={"C++","Java","Python"};
        JList<String> jl=new JList<>(langs);
        jl.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                Object value=jl.getSelectedValue();
                System.out.println(value);
            }
        });
        c.add(jl);
        jf.pack(); // removes the necessity of setting size
        jf.setVisible(true);
    }
}