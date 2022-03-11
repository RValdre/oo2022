import java.util.Arrays;

public class Funktsioonid_kodutöö {
    public static void main(String[] args) {
        // sout -> genereerin


        int[] haystack = {1, 2, 3};
        int needle = 2;
        int list_pikkus = haystack.length;

        int search = otsija(list_pikkus, needle, haystack);
        System.out.println("Nõel asub " + haystack[search] + "-s kuhjas !");


        int barn_amount = 6;
        int sheep = 30;
        int kogu_sheep = sheep_counter(barn_amount,sheep);
        System.out.println("Sa saad kokku mahutada " +  kogu_sheep + " lammast !");


        int banga_arve = 100;
        int ostu_kulu = 90;
        String ost = shopping(banga_arve, ostu_kulu);
        System.out.println(ost);
    }

    public static int sheep_counter (int barn, int sheep_amount_per_barn){
        int full_amount = barn * sheep_amount_per_barn;
        return full_amount;
    }

    public static int otsija (int kordadearv, int nõel, int [] hein) {
        int vastus = 0;
        for (int i = 0; i < kordadearv; i++) {
            if (hein[i] == nõel) {
                vastus = i;
            }
        }
        return vastus;
    }


    public static String shopping(float bank, float cost){
        if (bank >= cost) {
            return "Sul on ostuks piisavalt raha!";
        } else {
            return "Sul jääb ostuks rahast puudu!";
        }
    }
}

