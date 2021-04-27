public class Operators {
    public static void main(String[] args) {
        /*
        Operators in JAVA

        Operand,  operator, Operand = Result
        5           +         10       15

        Types of operators in JAVA
        1. Arithmetic operators
        2. Assignment operators
        3. Logical operators
        4. Comparison operators
         */


        //Arithmetic Operators

        int num1 = 43, num2 = 34;
        System.out.println("The value of num1 and num2 is : " + (num1+num2));
        System.out.println("The value of num1 and num2 is : " + (num1-num2));
        System.out.println("The value of num1 and num2 is : " + (num1*num2));
        System.out.println("The value of num1 and num2 is : " +  (num1/num2));
        System.out.println("The value of num1 and num2 is : " + (num1%num2));

        //Assignment Operators  +=,-=,*=,/=
        num1+=3;
        num2-=5;
        System.out.println("The value of num1 and num2 is : " + (num1++));          //    <----- make this line a comment and see the changes
        System.out.println("The value of num1 and num2 is : " + (++num1));

        /*
        Logical Operators
        1. && - Logical AND operator = Returns True only if both conditions are True
        2. || - Logical OR operator = Returns True if any one Condition is True
        3. !  - Logical NOT = Reverses the result

         */




        /*
        Comparison Operators
        1. ==
        2. !=
        3. <
        4. >
        5. <=
        6. >=
         */

    }
}
