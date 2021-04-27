import java.sql.SQLOutput;

public class Variables {

    public static void main(String[] args) {
        /*
        String
        Float
        Char
        Boolean
        Final Variables

        Syntax - DataType VariableName = Value;
         */
        String S = "Hello Guys";
        System.out.println(S);

        int a = 45;
        float b = 34.6f;    // 'f' should me mentioned at the end of the float value
        System.out.println(a + " " + b);

        boolean isChild = true;
        System.out.println(isChild);

        /*
        Rules for constructing name of variables in java
        -> Can contain digits, underscores, dollar signs, letters.
        -> Should not begin with special characters
        -> JAVA is a case sensitive language (Hello and hello is different).
        -> Should not contain whitespaces
        -> cannot use reserved Keyword in JAVA
         */

        /*
        Two types of JAVA Data Types:
        1. (Basic) Primitive data types - byte(1 Byte), short(2 Byte), int(4 Byte), long(8 Byte), float(4 Byte), double(8 Byte), boolean(1 Byte), char(2 Byte)
        2. (Derived) Non-Primitive data types -
         */

        byte u = 6;
        double d = 45.648732d; // 'd' is to be specified after the value
        // byte u1 = 165;

        System.out.println(u + " " + d);

        char alphabet = 'A';
        System.out.println(alphabet);
    }
}
