package May09;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        int n=0,a,b,op,res=0;
        while(n==0){
            String[] options={"Addition","Subtraction","Multiplication","Division"};
            a=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number"));
            b=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number"));
            op=JOptionPane.showOptionDialog(null, "Arithmetic Operation", "operation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch(op){
                case 0: res=a+b; break;
                case 1: res=a-b;break;
                case 2: res=a*b; break;
                case 3: res=a/b; break;
            }
            n=JOptionPane.showConfirmDialog(null, "The sum"+res+"\nDo you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
    }
}