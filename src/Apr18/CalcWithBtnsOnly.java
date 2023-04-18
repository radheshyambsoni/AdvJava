package Apr18;

import java.awt.*;
import java.awt.event.*;

public class CalcWithBtnsOnly implements ActionListener {
    Frame f;
    TextField ans;

    public CalcWithBtnsOnly() {
        f = new Frame("Basic Calculaor with Buttons Only");

        ans = new TextField();
        ans.setBounds(30, 30, 100, 30);
        f.add(ans);

        Button nine = new Button("9");
        Button eight = new Button("8");
        Button seven = new Button("7");
        Button six = new Button("6");
        Button five = new Button("5");
        Button four = new Button("4");
        Button three = new Button("3");
        Button two = new Button("2");
        Button one = new Button("1");
        Button zero = new Button("0");

        seven.setBounds(30, 60, 30, 30);
        eight.setBounds(70, 60, 30, 30);
        nine.setBounds(110, 60, 30, 30);
        four.setBounds(30, 100, 30, 30);
        five.setBounds(70, 100, 30, 30);
        six.setBounds(110, 100, 30, 30);
        one.setBounds(30, 140, 30, 30);
        two.setBounds(70, 140, 30, 30);
        three.setBounds(110, 140, 30, 30);
        zero.setBounds(70, 180, 30, 30);

        Button add = new Button("+");
        add.setBounds(150, 60, 30, 30);
        Button sub = new Button("-");
        sub.setBounds(150, 100, 30, 30);
        Button mul = new Button("*");
        mul.setBounds(150, 140, 30, 30);
        Button div = new Button("/");
        div.setBounds(150, 180, 30, 30);
        Button equal=new Button("=");
        equal.setBounds(30, 180, 30, 30);
        Button ac=new Button("AC");
        ac.setBounds(110, 180, 30, 30);

        Button quit = new Button("Quit");
        quit.setBounds(65, 220, 40, 30);

        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.add(zero);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(equal);
        f.add(ac);
        f.add(quit);
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        ac.addActionListener(this);
        quit.addActionListener(this);

        ans.setText("0");

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    double res = 0, num2=0;
    boolean flag = false;
    char op = ' ';
    StringBuilder exp=new StringBuilder("");
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("+")) {
                op='+';
                flag=true;
                exp.append('+');
                ans.setText(exp.toString());
            } else if (e.getActionCommand().equals("-")) {
                op='-';
                flag=true;
                exp.append('-');
                ans.setText(exp.toString());
            } else if (e.getActionCommand().equals("*")) {
                op='*';
                flag=true;
                exp.append('*');
                ans.setText(exp.toString());
            } else if (e.getActionCommand().equals("/")) {
                flag=true;
                exp.append('/');
                ans.setText(exp.toString());
                op='/';
            } else if (e.getActionCommand().equals("=")) {
                evaluate();
                flag=false;
            } else if (e.getActionCommand().equals("AC")) {
                flag=false;
                ans.setText("0");
                res=0;
                num2=0;
                op=' ';
                exp.setLength(0);
            } else if (e.getActionCommand().equals("Quit")) {
                System.exit(0);
            } else {
                char c=e.getActionCommand().charAt(0);
                if(flag){
                    num2=num2*10+(c-'0');
                }else{
                    res=res*10+(c-'0');
                }
                exp.append(c);
                ans.setText(exp.toString());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    void evaluate(){
        if(op=='+') res+=num2;
        else if(op=='-') res-=num2;
        else if(op=='*') res*=num2;
        else if(op=='/') res/=num2;

        ans.setText(Double.toString(res));
        res=0;
        num2=0;
        exp.setLength(0);
    }

    public static void main(String[] args) {
        CalcWithBtnsOnly c = new CalcWithBtnsOnly();
        System.out.println(c);
    }
}
