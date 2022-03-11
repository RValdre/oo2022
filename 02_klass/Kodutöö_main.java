import java.sql.SQLOutput;

public class Kodutöö_main {

    public static void main(String[] args) {



        int[] kuhi2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Kodutöö kodutöö = new Kodutöö(2, kuhi2);
        Kodutöö kodutöö1 = new Kodutöö(8,kuhi2);

        int vastus = kodutöö.needle_in_haystack();
        int vastus2 = kodutöö1.needle_in_haystack();

        System.out.println("Esimene nõel asub " + vastus + "-s kuhjas !");
        System.out.println("Teine nõel asub " + vastus2 + "-s kuhjas !");


        kodutöö1.vastus = 3;
        System.out.println("Vastus on: " + kodutöö1.vastus);
        kodutöö1.find_needle();
        System.out.println("Vastus on: " + kodutöö1.vastus);


    }
}