import java.util.ArrayList;
import java.util.Scanner;


public class Algarvud_Ragnar_Valdre {

    public static void  main(String[] args){
        //int sisend = 50;

        Scanner scan   = new Scanner(System.in);
        System.out.print("Sisesta arv: ");
        int sisend = scan.nextInt();
        scan.close();

        jagaja(sisend);
        algarv(sisend);
        Algarvujuur numbers = new Algarvujuur();
        Algarvujuur lesser = new Algarvujuur();
        Algarvujuur greater = new Algarvujuur();



        ArrayList<Integer> arvud = numbers.algarvujuur();

        int last_nr = arvud.get(arvud.size() - 1);
        double juur_nr = Math.sqrt(last_nr);
        ArrayList<Integer> väiksemad = lesser.juure_algarvud(arvud, juur_nr);
        ArrayList<Integer> suuremad = greater.greater_algarvud(arvud, juur_nr);




        System.out.println(arvud);
        System.out.println( last_nr + " ruutjuur: " + juur_nr);
        System.out.println("Väiksemad: " + väiksemad + ", Suuremad: " + suuremad);





    }

    public static void jagaja(int arv){
        if(arv % 2 == 0){
            System.out.println("Sisestatud arv jagub kahega! ");
        }

        if(arv % 3 == 0){
            System.out.println("Sisestatud arv jagub kolmega! ");
        }

        if(arv % 5 == 0){
            System.out.println("Sisestatud arv jagub viiega! ");
        }

        if(arv % 7 == 0){
            System.out.println("Sisestatud arv jagub seitsmega! ");
        }
    }

    public static void algarv(int arv){
        boolean tingimus = false;

        for (int i = 2; i <= arv / 2; i++) {

            if(arv % i == 0) {
                tingimus = true;
                break;
            }

        }
        if (!tingimus){
            System.out.println("Sisestatud number on algarv !");
        } else {
            System.out.println("Sisestatud number ei ole algarv !");
        }
    }

}
