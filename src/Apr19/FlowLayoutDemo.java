package Apr19;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Form Layout Demo");
        f.setSize(300, 100);
        f.setLayout(new FlowLayout());
        f.add(new Button("OK"));
        f.add(new Button("CANCEL"));
        f.setVisible(true);
    }
}
