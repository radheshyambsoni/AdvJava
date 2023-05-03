package May03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;;

public class SwingJTree {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Jlist");
        Container c=jf.getContentPane();
        c.setLayout(new FlowLayout());
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Computer");
        DefaultMutableTreeNode c1=new DefaultMutableTreeNode("HDD");
        DefaultMutableTreeNode c2=new DefaultMutableTreeNode("CPU");
        DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Mouse");
        DefaultMutableTreeNode c11=new DefaultMutableTreeNode("Seagate");
        DefaultMutableTreeNode c12=new DefaultMutableTreeNode("Samsung");
        DefaultMutableTreeNode c21=new DefaultMutableTreeNode("Intel");
        DefaultMutableTreeNode c22=new DefaultMutableTreeNode("IBM");
        DefaultMutableTreeNode c31=new DefaultMutableTreeNode("HP");
        DefaultMutableTreeNode c32=new DefaultMutableTreeNode("Dell");

        root.add(c1);
        root.add(c2);
        root.add(c3);
        c1.add(c11);
        c1.add(c12);
        c2.add(c21);
        c2.add(c22);
        c3.add(c31);
        c3.add(c32);

        c.add(new JTree(root));
        jf.pack();
        jf.setVisible(true);

        // TreeModel is a model that can be overloaded to implement your own tree
        // for ex the leaf nodes are shown as files and not empty folder, so to do that TreeModel is helpful
        // or if we want to perform any tree operation then also TreeModel is helpful
    }
}
