
public class Tree {
    public void growth(int rate, String name){
        char vowel = name.charAt(0);
        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("I am an " + name + " tree! And I grow at a rate of " + rate + " cm per year!");
                break;
            default:
                System.out.println("I am a " + name + " tree! And I grow at a rate of " + rate + " cm per year!");
        }
    }

    public void lifespan (int year){
        System.out.println("I will last for " + year + " years ");
    }

    public void dead(boolean condition){
        if(!condition){
            System.out.println("Is still alive!\n");
        } else {
            System.out.println("Has died :'C\n");
        }

    }


}
