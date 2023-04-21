package Layout;

import java.awt.*;

public class PanelDem0 {
    public static void main(String[] args) {
        Frame f =new Frame("CALCULATOR");
        f.setSize(200,250);
        Panel p =new Panel();
        p.setLayout(new GridLayout(5,3));
        String[] s ={"0", "+", "-","*", "/", "="};
        for (int i=1; i<=9; i++){
            p.add(new Button(i+""));
        }
        for (int i=0; i<s.length; i++){
            p.add(new Button(s[i]));
        }
        f.add(new TextField(15), BorderLayout.NORTH);
        f.add(p,BorderLayout.CENTER);
        f.setVisible(true);
    }
}
