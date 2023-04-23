package Apr21;

import java.awt.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(200,120);
        FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.LEADING);
        f.setLayout(fl);
        f.add(new TextArea("Some text",3,20));
        f.setVisible(true);
    }
}
