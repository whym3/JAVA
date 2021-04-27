import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.nextLine();
        System.out.println(input);
    }
}
