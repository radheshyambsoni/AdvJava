package Layout;

import java.awt.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(200,120);
        f.setLayout(new FlowLayout());
        f.add(new TextArea("Some text",3,20));
        f.setVisible(true);
    }
}
