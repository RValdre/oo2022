public class Kodutoo_main {

    public static void  main(String[] args){

        int[] kuhi = {1,2,3,4,5,6,7,8,9,10};
        Info info = new Info(1,4,5);
        Kodutoo kodutoo = new Kodutoo(info,kuhi);

        int needle_answer = kodutoo.needle_in_haystack(info.needle);
        int nail_answer = kodutoo.needle_in_haystack(info.nail);
        int hairpin_answer = kodutoo.needle_in_haystack(info.hairpin);

        System.out.println("Nõel asub " + needle_answer + "-s kuhjas !");
        System.out.println("Nael asub " + nail_answer + "-s kuhjas !");
        System.out.println("Juuksenõel asub " + hairpin_answer + "-s kuhjas !");




    }
}
