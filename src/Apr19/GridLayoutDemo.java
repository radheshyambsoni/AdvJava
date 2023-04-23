package Apr19;

import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300, 100);
        f.setLayout(new GridLayout(2, 2));
        f.add(new Button("OK"));
        f.add(new Button("CANCEL"));
        f.add(new Button("row 1 col 1"));
        f.add(new Button("row 2 col 2"));
        f.setVisible(true);

    }
}
