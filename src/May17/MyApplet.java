package May17;

import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(25, 25, 100, 25);

        g.drawRect(25, 40, 100, 50);

        g.drawOval(25, 205, 100, 50);

        g.drawArc(145, 345, 100, 50, 125, 75);
    }
}
