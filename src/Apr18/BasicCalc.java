package Apr18;

import java.awt.*;
import java.awt.event.*;

public class BasicCalc implements ActionListener{
    Frame f;
    TextField n1,n2,ans;
    double num1,num2;
    
    public BasicCalc() {
        f=new Frame("Basic Calculator");
        Label l1=new Label("Enter first number: ");
        l1.setBounds(20, 50, 180, 30);
        n1=new TextField();
        n1.setBounds(210,50,40,30);
        Label l2=new Label("Enter second number: ");
        l2.setBounds(20, 90, 180, 30);
        n2=new TextField();
        n2.setBounds(210,90,40,30);
        Label res=new Label("Result: ");
        res.setBounds(20, 130, 120, 30);
        ans=new TextField();
        ans.setBounds(180, 130, 40, 30);

        f.add(l1);
        f.add(n1);
        f.add(l2);
        f.add(n2);
        f.add(res);
        f.add(ans);

        Button add=new Button("Add");
        add.setBounds(20,170, 60, 30);
        Button sub=new Button("Subtract");
        sub.setBounds(90,170, 60, 30);
        Button mul=new Button("Multiply");
        mul.setBounds(20,210, 60, 30);
        Button div=new Button("Divide");
        div.setBounds(90,210, 60, 30);
        Button quit=new Button("Quit");
        quit.setBounds(40, 250, 60, 30);

        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(quit);

        f.setSize(900, 300);
        f.setLayout(null);
        f.setVisible(true);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        quit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getActionCommand().equals("Add")){
                double a=Double.parseDouble(n1.getText());
                double b=Double.parseDouble(n2.getText());
                ans.setText(Double.toString((a+b)));
            }else if(e.getActionCommand().equals("Subtract")){
                double a=Double.parseDouble(n1.getText());
                double b=Double.parseDouble(n2.getText());
                ans.setText(Double.toString((a-b)));
            }else if(e.getActionCommand().equals("Multiply")){
                double a=Double.parseDouble(n1.getText());
                double b=Double.parseDouble(n2.getText());
                ans.setText(Double.toString((a*b)));
            }else if(e.getActionCommand().equals("Divide")){
                double a=Double.parseDouble(n1.getText());
                double b=Double.parseDouble(n2.getText());
                ans.setText(Double.toString((a/b)));
            }else if(e.getActionCommand().equals("Quit")){
                System.exit(0);
            }
        }catch(Exception ex){
            ans.setText("Invalid operation!");
        }
    }

    public static void main(String[] args) {
        BasicCalc b=new BasicCalc();
        System.out.println(b);
    }
}