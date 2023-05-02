package May02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Assign4 {
    public static void main(String[] args) throws InterruptedException {
        JFrame jf = new JFrame("JTextField");
        Container c = jf.getContentPane();
        jf.setSize(1000, 800);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Name"));
        c.add(new JTextField(10));
        jf.setVisible(true);

        JPasswordField jpf = new JPasswordField(10);
        c.add(new JLabel("Password "));
        c.add(jpf);
        jpf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pwd = new String(jpf.getPassword());
                JOptionPane.showMessageDialog(jf, "password is: " + pwd);
            }
        });

        jf.setSize(200, 200);
        int row = 3, col = 4;
        JTable jt = new JTable(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                jt.setValueAt((i + 1) + "" + (j + 1), i, j);
            }
        }
        c.add(jt);

        String[] lang = { "Java", "C++", "Python" };
        JComboBox<String> jcb = new JComboBox<>(lang);
        c.add(jcb);
        JLabel jl = new JLabel();
        c.add(jl);
        jcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jl.setText("Selected: " + jcb.getSelectedItem());
            }
        });

        jf.setSize(400, 400);
        jf.setVisible(true);
        
        JProgressBar jpb=new JProgressBar(0, 100);
        c.add(jpb);
        jpb.setStringPainted(true);
        for(int i=0;i<=100;i++){
            jpb.setValue(i);
            Thread.sleep(100);
        }

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("ReactJS");
        l1.addElement("MongoDB");
        l1.addElement("ExpressJS");
        l1.addElement("NodeJS");
        JList<String> list = new JList<>(l1);
        c.add(list);

        DefaultMutableTreeNode coding = new DefaultMutableTreeNode("Languages");
        DefaultMutableTreeNode dsa = new DefaultMutableTreeNode("dsa");
        DefaultMutableTreeNode tech = new DefaultMutableTreeNode("tech");
        coding.add(dsa);
        coding.add(tech);
        DefaultMutableTreeNode java = new DefaultMutableTreeNode("java");
        DefaultMutableTreeNode cpp = new DefaultMutableTreeNode("cpp");
        DefaultMutableTreeNode python = new DefaultMutableTreeNode("python");
        dsa.add(java);
        dsa.add(cpp);
        dsa.add(python);
        DefaultMutableTreeNode reactjs = new DefaultMutableTreeNode("reactjs");
        DefaultMutableTreeNode android = new DefaultMutableTreeNode("aws");
        DefaultMutableTreeNode flutter = new DefaultMutableTreeNode("flutter");
        tech.add(reactjs);
        tech.add(android);
        tech.add(flutter);
        JTree jtr = new JTree(coding);
        c.add(jtr);
    }
}