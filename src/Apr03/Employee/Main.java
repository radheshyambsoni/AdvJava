package Apr03.Employee;

public class Main{
    // Inheritance - creating new (derived/sub class) classes from existing (base/super class) classes
    // This the main class for the package
    public static void main(String[] args) {
        Employee e=new Employee("10994", "Radheshyam", "Soni");
        System.out.println(e.createShortName());
        System.out.println(e.getFname());
        System.out.println(e.getLname());

        PartTimeEmployee p=new PartTimeEmployee("10993", "Vishvas", "Patel", 100);
        System.out.println(p.createShortName());
        System.out.println(p.getFname());
        System.out.println(p.getLname());
        System.out.println(p.getRegnum());
        System.out.println(p.calculateWeeklyPay(40));
    }
}