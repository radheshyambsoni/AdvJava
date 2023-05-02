package May01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Assign3 implements MouseListener{
    Frame f;
    TextField username,pwd;
    Button login,exit;
    public Assign3(){
        f=new Frame("Login Screen");

        Label l1=new Label("Username");
        l1.setBounds(100, 40, 90, 30);

        username=new TextField();
        username.setBounds(191, 40, 90, 30);
        username.addMouseListener(this);
        
        Label l2=new Label("Password");
        l2.setBounds(100, 80, 90, 30);

        pwd=new TextField();
        pwd.setBounds(191, 80, 90, 30);
        pwd.addMouseListener(this);
        
        login=new Button("Login");
        login.setBounds(100, 120, 90, 30);
        
        exit=new Button("Exit");
        exit.setBounds(191, 120, 90, 30);

        f.add(l1);
        f.add(l2);
        f.add(username);
        f.add(pwd);
        f.add(login);
        f.add(exit);
        
        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==username){
            username.setText("Username in format username@abc.com");
        }else if(e.getSource()==pwd){
            pwd.setText("Enter password");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args) {
        new Assign3();
    }
}