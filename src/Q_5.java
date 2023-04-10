class Employee{
    String name;
    int year_of_joining;
    int salary;
    String address;
}
public class Q_5 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.name = "Robert";
        a.year_of_joining = 1994;
        a.address = "64C- WallsStreet";

        Employee b = new Employee();
        b.name = "Sam";
        b.year_of_joining = 2000;
        b.address = "68D- WallsStreet";

        Employee c= new Employee();
        c.name = "John";
        c.year_of_joining = 1999;
        c.address = "26B- WallsStreet";

        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address");
        System.out.println(a.name + "\t" + a.year_of_joining + "\t" + a.address);
        System.out.println(b.name + "\t" + b.year_of_joining + "\t" + b.address);
        System.out.println(c.name + "\t" + c.year_of_joining + "\t" + c.address);
    }
}
