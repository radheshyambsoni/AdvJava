package Apr19;

import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300,100);
        f.setLayout(new GridLayout(1,2));
        f.add(new Button("OK"));
        f.add(new Button("CANCEL"));
        f.setVisible(true);

    }
}
