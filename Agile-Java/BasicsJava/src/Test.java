
public class Test {

    //public = Iedereen kan het zien
    //private = Strict tot dit bestand

    public static void main(String[] args) {

//        String nummer = "Ik ben";
//        String nummer2 = "Mitch";
//
//        String uitkomst = nummer + nummer2;
//
//        System.out.println(uitkomst);


        test3(3, 5);
        test3(4, 5);
        test3(5, 5);
        test3(7, 5);

        /*
       String tekst = "Hoi ik ben Mitch";
       double decimaal = 1.0;
       float floating = 1.0F;
         */

        // int - 1
        // naam - 2
        // = - 3
        // Wat gaat het worden - 4
    }

    public static void test3(Integer nummer1, Integer nummer2) {
        int uitkomst = nummer1 + nummer2;
        System.out.println(uitkomst);
    }
}
