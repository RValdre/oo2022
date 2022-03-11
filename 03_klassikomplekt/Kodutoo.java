public class Kodutoo {
    Info info;
    int[] heinakuhi;

    public Kodutoo(Info info, int[] haystack){
        this.info = info;
        this.heinakuhi = haystack;
    }

    public int needle_in_haystack (int item) {
        int vastus = 0;
        for (int i = 0; i < heinakuhi.length; i++) {
            if (heinakuhi[i] == item) {
                vastus = heinakuhi[i];
                break;
            }
        }
        return vastus;
    }



}
