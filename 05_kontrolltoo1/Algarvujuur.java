import java.util.ArrayList;
import java.util.Collections;

public class Algarvujuur {
    public ArrayList<Integer> algarvujuur(){
        int start_nr = 2;
        ArrayList<Integer> arvud = new ArrayList<>();
        while(arvud.size() < 1000){

            boolean tingimus = false;
            for (int i = 2; i <= start_nr / 2; i++) {

                if(start_nr % i == 0) {
                    tingimus = true;
                    break;
                }
            }
            if (!tingimus){
                arvud.add(start_nr);
                start_nr++;
            } else {
                start_nr++;
            }


        }
        return arvud;
    }

    public ArrayList<Integer> juure_algarvud(ArrayList<Integer> numbers, double juur){
        int start_nr = 0;
        int counter = 10;
        ArrayList<Integer> lesser = new ArrayList<>();
        while(numbers.get(start_nr) < juur) {
            start_nr++;

        }
        start_nr--;

        for (int i = 0; i < counter; i++) {
            lesser.add(numbers.get(start_nr));
            start_nr--;
        }
        Collections.sort(lesser);
        return lesser;
    }

    public ArrayList<Integer> greater_algarvud(ArrayList<Integer> numbers, double juur){
        int start_nr = 999;
        int counter = 10;
        ArrayList<Integer> greater = new ArrayList<>();
        while(numbers.get(start_nr) > juur) {
            start_nr--;
        }
        start_nr++;
        for (int i = 0; i < counter; i++) {
            greater.add(numbers.get(start_nr));
            start_nr++;
        }

        return greater;
    }
}
