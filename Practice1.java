/*
Create a class Employee with following properties :
1. Salary (int)
2. getSalary()
3. Name (String)
4. getName()
5. setName()
 */

class Employe {
    int salary = 50000;
    String name;

    public void getSalary(){
        System.out.println("My salary is " + salary);
    }
    public void getName(){
        System.out.println("My name is " + name);
    }
    public void setName(String x){
        name = x;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Employe rohit = new Employe();
        rohit.setName("Hardik");
        rohit.getName();
        rohit.getSalary();
    }
}
