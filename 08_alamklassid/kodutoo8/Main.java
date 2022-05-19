public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Pear pear = new Pear();
        Cherry cherry = new Cherry();

        apple.growth(30,"apple");
        apple.lifespan(50);
        apple.dead(true);

        pear.growth(60, "pear");
        pear.lifespan(50);
        pear.dead(false);

        cherry.growth(38, "cherry");
        cherry.lifespan(25);
        cherry.dead(false);
    }
}
