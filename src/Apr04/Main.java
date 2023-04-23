package Apr04;

public class Main {
    public static void main(String[] args) {
        // Abstract Class - cannot be instatntiated outside the class
        // Abstract method - method without body

        // Final class - cannot be inherited
        // Final variable - cannot be changed

        // Interfaces - blueprint/template for building classes
        // A class can implement as multiple interfaces
        FinalClass f=FinalClass.getInstance();
        System.out.println(f);
    }
}