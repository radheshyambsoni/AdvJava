package Apr17;

public class GUI{
    public static void main(String[] args) {
        // CUI - Character User Interface
        // GUI - Graphical User Interface

        // AWT - Abstract Window Toolkit
        // - API for GUI
        // Platform dependent component
        // heavyweights
        // Hierarchy --->
        //                             Object
        //                               |
        //                           Component
        //                               |
        //    |----------|--------|-------------|--------|--------|
        // Button      Label   CheckBox       Choice    List   Container(contains other component)
        //                                                       |
        //                                              |----------------|
        //                                           Window            Panel
        //                                             |                 |
        //                                      |--------------|        Applet
        //                                   Frame           Dialog

        // First f=new First();

        Add a=new Add();
        System.out.println(a);
    }
}