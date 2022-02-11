import java.util.Scanner;

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
        int playerCoordinateY = generateRandomCoordinate(worldheight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldheight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldheight,worldWidth,playerCoordinateY,playerCoordinateX,enemyCoordinateY,enemyCoordinateX);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // kontrollib ühte muutujat mingite väärtuste vastu
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;

            }
            printMap(worldheight, worldWidth, playerCoordinateY, playerCoordinateX, enemyCoordinateY, enemyCoordinateX);
            input = scanner.nextLine();
        }
    }

    public static int generateRandomCoordinate(int worldSize){
        return (int) (Math.random() * (worldSize-2))+1;
    }

    public static void printMap(int worldheight, int worldWidth, int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX) {


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
                if (playerCoordinateY == y && playerCoordinateX == x){
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

