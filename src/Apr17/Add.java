package Apr17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add implements ActionListener {
    Frame f=new Frame();
    TextField tf1=new TextField();
    TextField tf2=new TextField();
    TextField sum=new TextField();
    int num1,num2,res;
    public Add(){
        Label l1=new Label("Enter number 1: ");
        l1.setBounds(20, 80, 150, 30);
        tf1.setBounds(170, 80, 60, 30);
        Label l2=new Label("Enter number 2: ");
        l2.setBounds(20, 120, 150, 30);
        tf2.setBounds(170, 120, 60, 30);

        Label s=new Label("Sum: ");
        s.setBounds(20, 160, 100, 30);
        sum.setBounds(140, 160, 60, 30);

        Button b=new Button("Add");
        b.setBounds(30, 220, 80, 30);

        Button q=new Button("Quit");
        q.setBounds(120, 220, 80, 30);
        
        f.add(b);
        f.add(q);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(s);
        f.add(sum);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(this);
        q.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Add")){
            num1=Integer.parseInt(tf1.getText());
            num2=Integer.parseInt(tf2.getText());
            res=num1+num2;
            sum.setText(Integer.toString(res));
        }
        if(e.getActionCommand().equals("Quit")){
            System.exit(0);
        }
    }
}
