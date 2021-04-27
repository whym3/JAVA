public class TryCatch {

    public static void main(String[] args) {
        String[] Cars = {"Ford", "MG", "Innova", "Suzuki"};
        try{
        System.out.println(Cars[5]);
        } catch (Exception e){
            System.out.println("Error");
        }

        System.out.println("Hello");
    }
}
