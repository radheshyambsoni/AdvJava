package Apr19;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(250, 150);
        f.setLayout(new GridLayout(3, 2));

        // Username
        Label u = new Label("Username");
        f.add(u);
        TextField us = new TextField();
        // us.setBounds(120, 50, 80, 20);
        f.add(us);

        // Password
        Label p = new Label("Password");
        f.add(p);
        TextField pwd = new TextField();
        // pwd.setBounds(120, 100, 80, 20);
        pwd.setEchoChar('*');
        f.add(pwd);

        Button b1 = new Button("OK");
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        Button b2 = new Button("CANCEL");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        f.add(b2);
        f.setVisible(true);
    }
}
