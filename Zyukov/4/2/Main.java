import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Fruit randomFabrics[] = new Fruit[10];
        for (int i = 0; i < randomFabrics.length; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    randomFabrics[i] = new ThinOrangeFactory().makeFruit();
                    break;
                case 1:
                    randomFabrics[i] =  new RedApplesFactory().makeFruit();
                    break;
                case 2:
                    randomFabrics[i] =  new GreenApplesFactory().makeFruit();
                    break;
                default:
                    randomFabrics[i] =  new LongPineapplesFactory().makeFruit();
                    break;
            }
        }

        int fabric = 0;
        Fruit notRandomFabrics[] = new Fruit[20];
        for (int i = 0; i < notRandomFabrics.length; i++) {
            switch (fabric) {
                case 0:
                    notRandomFabrics[i] =  new ThinOrangeFactory().makeFruit();
                    break;
                case 1:
                    notRandomFabrics[i] =  new RedApplesFactory().makeFruit();
                    break;
                case 2:
                    notRandomFabrics[i] =  new GreenApplesFactory().makeFruit();
                    break;
                default:
                    notRandomFabrics[i] =  new LongPineapplesFactory().makeFruit();
                    break;
            }
            if ((i+1) % 2 == 0) {
                if (fabric < 3) {
                    fabric++;
                } else {
                    fabric = 0;
                }
            }
        }
    }
}
