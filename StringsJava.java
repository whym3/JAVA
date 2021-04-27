public class StringsJava {

    public static void main(String[] args) {
        String name = "Josh";
        String name2 = "Jatin";

        System.out.println(name);
        System.out.println(name2);

        //concatenation of strings
        System.out.println(name + name2);
        System.out.println(name + " " + name2);

        //Length of strings
        System.out.println(name.length());
        System.out.println((name + " " + name2).length());

        //UPPERCASE and lowercase
        System.out.println(name.toUpperCase());
        System.out.println(name2.toUpperCase());

        //Double Quotes inside a String (Escape sequence characters)
        System.out.println(name + " is a \"brother\" of " + name2);
        System.out.println(name + " is a \"brother\" \tof " + name2);
        System.out.println(name + " is a \"brother\" \nof " + name2);

        //Contains or not
        System.out.println(name.contains("Jo"));

        //charAt
        System.out.println(name.charAt(2));

        //other functions
        System.out.println(name.endsWith("sh"));
        System.out.println(name.indexOf("sh"));

    }
}
