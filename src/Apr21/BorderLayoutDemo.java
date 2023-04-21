package Apr21;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Border Layout Demo");
        f.setSize(300,120);
        f.setLayout(new BorderLayout());
        f.add(new Button("North"),BorderLayout.NORTH);
        f.add(new Button("South"),BorderLayout.SOUTH);
        f.add(new Button("Center"),BorderLayout.CENTER);
        f.add(new Button("East"),BorderLayout.EAST);
        f.add(new Button("West"),BorderLayout.WEST);
        f.setVisible(true);
    }
}
