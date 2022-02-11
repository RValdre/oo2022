public class Game {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // String -- sõnaline muutuja
        // char -- üks täht
        // int -- täiskohaline number 2.1 mlj
        // double -- 15 kohaline komakohaga number
        // float -- 7 kohaline komakohaga number
        // byte -- 128kohta
        // short -- 3200kohta
        // Long -- BIG number
        // boolean -- true/false
        int worldheight = 5;
        int worldWidth = 10;

        //fori -- automate for loop
        char symbol;
        for (int y = 0; y < worldheight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldheight - 1) {
                    symbol = '_';
                } else if (x == 0 || x == worldWidth - 1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

