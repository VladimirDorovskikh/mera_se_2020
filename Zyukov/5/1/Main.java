import java.util.Random;

public class Main {
    private final static int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < figures.length; i++) {
            switch (new Random().nextInt(2)) {
                case 0:
                    figures[i] = new Circle();
                    break;
                default:
                    figures[i] = new Rectangle();
                    break;
            }
        }

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].toString() + " - " + figures[i].square());
        }
    }
}