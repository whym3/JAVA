import java.util.Scanner;

/*
Create a class square with a method to initialize its
side, calculating area, perimeter etc.
 */
class  shape {
    public void perimeter(int a){
        System.out.println(a*4);
    }

    public void rectPerimeter(int l, int b){
        System.out.println(2*(l+b));
    }

    public void Area(int a){
        System.out.println(a*a);
    }

    public void rectArea(int l, int b){
        System.out.println(l*b);
    }

    public void Diagonal(int a){
        System.out.println(a*Math.sqrt(2));
    }

    public void rectDiagonal(int l, int b){
        System.out.println(Math.sqrt((l*l+b*b)));
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats's your Shape: ");
        String s = scan.nextLine();

        if (s.contains("square")){
            System.out.println("Enter side length:");
            int side = scan.nextInt();
            shape first = new shape();
            first.Area(side);
            first.perimeter(side);
            first.Diagonal(side);
        }
        else if (s.contains("rect")){
            int l,b;
            System.out.print("Enter Length :");
            l = scan.nextInt();
            System.out.print("Enter Breadth :");
            b = scan.nextInt();
            shape rect = new shape();
            rect.rectPerimeter(l,b);
            rect.rectArea(l,b);
            rect.rectDiagonal(l,b);

        }
    }
}
