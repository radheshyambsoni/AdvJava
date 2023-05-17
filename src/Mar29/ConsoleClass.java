package Mar29;

public class ConsoleClass {
    public static void main(String[] args) {
        System.out.print("Enter some user input: ");
        String input = System.console().readLine();
        System.out.print("You entered: " + input);
    }
}