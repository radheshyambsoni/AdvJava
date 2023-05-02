package May02;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class SwingProgressBar {
    public static void main(String[] args) throws InterruptedException {
        JFrame jf=new JFrame("JProgressBar");
        Container c=jf.getContentPane();
        c.setLayout(new FlowLayout());
        jf.setSize(400, 400);
        jf.setVisible(true);
        
        JProgressBar jpb=new JProgressBar(0, 100);
        c.add(jpb);
        jpb.setStringPainted(true);
        for(int i=0;i<=100;i++){
            jpb.setValue(i);
            Thread.sleep(100);
        }
    }
}
