import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        //if-else statements

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        if(age < 20)
            System.out.println("Allowed");
        else if(age > 20)
            System.out.println("Adult");
        else
            System.out.println("Bye Bye");

    }
}
