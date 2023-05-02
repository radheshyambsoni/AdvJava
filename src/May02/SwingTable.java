package May02;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTable;

public class SwingTable {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JTextField Example");
        Container c=jf.getContentPane();
        jf.setSize(200, 200);
        int row=4,col=2;
        JTable jt=new JTable(row, col);
        for(int i=0;i<row;i++){
            jt.setValueAt(i, i, 0);
            jt.setValueAt(i*i, i, 1); //args: value, row, col
        }
        c.add(jt);
    }
}
