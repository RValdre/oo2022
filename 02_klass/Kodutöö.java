public class Kodutöö {
    int vastus; // kasutan alumisel variandil
    int nõel;
    int[] heinakuhi;

    public Kodutöö(int needle, int[] haystack) {
        this.nõel = needle;
        this.heinakuhi = haystack;
    }


    // standard variant
    public int needle_in_haystack () {
        int vastus = 0;
        for (int i = 0; i < heinakuhi.length; i++) {
            if (heinakuhi[i] == nõel) {
                vastus = heinakuhi[i];
                break;
            }
        }
        return vastus;
    }

    // class.return void(no return) variant
    public void find_needle() {
        for (int i = 0; i < heinakuhi.length; i++) {
            if (heinakuhi[i] == nõel) {
                vastus = heinakuhi[i];
                break;
            }
        }

    }

}
