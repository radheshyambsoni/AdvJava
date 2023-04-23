package Apr21;

import java.awt.*;

public class ListDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        String[] colors = { "Green", "Red", "Blue", "Cyan", "Yellow", "Magenta" };
        f.setSize(250, 200);
        f.setLayout(new FlowLayout());
        List lst = new List(6);
        for (int i = 0; i < colors.length; i++) lst.add(colors[i]);
        f.add(new Label("Colors"));
        f.add(lst);
        f.setVisible(true);
    }
}
