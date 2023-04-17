package Apr17;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends Frame implements ActionListener{
    // The implemented interface is used to listen the events
    First(){
        Button b=new Button("Click Me");
        b.setBounds(30, 100, 80, 30);

        // If we don't wish to use inheritance, we can create a frame object and call the methods using its object

        add(b);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }    
}
