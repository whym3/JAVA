
class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}
public class OOPS2 {

    public static void main(String[] args) {

        //INstantiating a new employee
        Employee Josh = new Employee();
        Employee John = new Employee();

        //Setting attributes
        Josh.id = 324;
        Josh.name = "Josh";
        Josh.salary = 45000;

        John.id = 32346;
        John.name = "John";
        John.salary = 34000;

        //Printing the Attributes
        System.out.println(Josh.id + " " + Josh.name);

        //Calling the method to directly access
        Josh.printDetails();
        John.printDetails();
        System.out.println(John.getSalary());
    }
}
