import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_JAVA {

    public static void main(String[] args) {
        //collection of values is an array

        int[] marks = {1, 2, 3, 4, 5};
        System.out.println(marks[0]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for(int value:marks){                 // For Each Loop
            System.out.println(value);
        }

        //2D array
        int[][] marks1 = {{1,2,3},{2,3,4},{3,4,5}};

        String[] Cars = {"Ford", "MG", "Innova", "Suzuki"};
        for (String value:
             Cars) {
            System.out.println(value);
        }
    }
}
