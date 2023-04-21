package Layout;

import java.awt.*;

public class CheckBoxDemo {
    public static void main(String[] args) {
        Frame f =new Frame();
        f.setSize(300,150);
        f.setLayout(new GridLayout(3,1));
        //Check Box groups
        CheckboxGroup cbg=new CheckboxGroup();
        f.add(new Checkbox("one", cbg, false));
        f.add(new Checkbox("two", cbg, true));
        // Normal singular check box
        f.add(new Checkbox("WiFi"));
        f.add(new Checkbox("3G"));
        f.add(new Checkbox("Camera"));
        f.setVisible(true);
    }
}
