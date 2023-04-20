package Apr20;

public class Main {
    public static void main(String[] args) {
        // Java Bean
        // A reusable component that may encapsulate many other components
        // A java class with 
        //      - implements serializable interface
        //      - private fields with getters and setters
        //      - a no-arg constructor

        Employee e=new Employee();
        e.setId(10994);
        e.setName("Radheshyam");
        System.out.println(e.getId()+" "+e.getName()); 
    }
}
