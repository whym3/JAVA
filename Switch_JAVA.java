import java.util.Scanner;

public class Switch_JAVA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        switch (age){
            case 12:
                System.out.println("Go Back");
                break;

            case 18:
                System.out.println("Hi");
                break;

            case 70:
                System.out.println("Hello");
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
