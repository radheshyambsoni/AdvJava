package Apr21;

import java.awt.*;

public class ChoiceDemo {
    public static void main(String[] args) {
        Frame f =new Frame();
        f.setSize(300,150);
        f.setLayout(new FlowLayout());
        Choice colors=new Choice();
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        f.add(new Label("Choose a color"));
        f.add(colors);
        f.setVisible(true);
    }
}
