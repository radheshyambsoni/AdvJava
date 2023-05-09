package May09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class PopupMenu {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Popup Menu");
        JPopupMenu jpm=new JPopupMenu();
        JMenuItem jmi1=new JMenuItem("Item1");
        JMenuItem jmi2=new JMenuItem("Item2");
        jpm.add(jmi1);
        jpm.add(jmi2);

        jf.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                jpm.show(jf, e.getX(), e.getY());
            }
        });

        jmi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(jf, "Popup Menu Item1 is clicked");
            }
        });
        jmi2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(jf, "Popup Menu Item2 is clicked");
            }
        });
        jf.add(jpm);
        jf.setSize(300, 150);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}
