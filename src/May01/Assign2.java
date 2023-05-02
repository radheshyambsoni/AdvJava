package May01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Assign2 implements ActionListener,TextListener{
    Frame f1,f2;
    Button copy1;
    TextField tf11,tf12,tf21,tf22;
    public void copyWithButton(){
        f1=new Frame("Copy on click");

        tf11=new TextField();
        tf11.setBounds(10, 40, 50, 30);

        copy1=new Button("Copy->");
        copy1.setBounds(70, 40, 60, 30);
        copy1.addActionListener(this);
        
        tf12=new TextField();
        tf12.setBounds(140,40,50,30);

        f1.add(tf11);
        f1.add(copy1);
        f1.add(tf12);
        
        f1.setSize(200, 100);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public void copyWithoutButton(){
        f2=new Frame("Copy Without click");

        tf21=new TextField();
        tf21.setBounds(10, 40, 50, 30);
        tf21.addTextListener(this);
        
        tf22=new TextField();
        tf22.setBounds(140,40,50,30);

        f2.add(tf21);
        f2.add(tf22);
        
        f2.setSize(200, 100);
        f2.setLayout(null);
        f2.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Copy->")){
            tf12.setText(tf11.getText());
        }
    }
    @Override
    public void textValueChanged(TextEvent e) {
        if(e.getSource()==tf21){
            tf22.setText(tf21.getText());
        }
    }
    public static void main(String[] args) {
        Assign2 o=new Assign2();
        o.copyWithButton(); // method creating interface with button to copy
        o.copyWithoutButton(); // method creating interface without button to copy
    } 
}