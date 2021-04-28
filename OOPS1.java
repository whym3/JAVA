public class OOPS1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Whym3";

        Person p2 = new Person();
        p2.name = "Josh";
        p2.age = 45;

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p2.walk();
    }
}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + " is eating");
    }

}
