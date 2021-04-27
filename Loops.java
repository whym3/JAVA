public class Loops {

    public static void main(String[] args) {

        int z = 12;

        System.out.println("FOR");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("WHILE");
        while(z<=12 && z>0) {
            System.out.println(z);
            z--;
        }

        System.out.println("DO WHILE");
        do{
            System.out.println(z);
            z++;
        } while (z == 0);
    }
}
