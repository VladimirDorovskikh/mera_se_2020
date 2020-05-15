import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        AbstractFabric[] fabricList = new AbstractFabric[10];
        for (int n=0; n<10; n++){
            int randomFabric = new Random().nextInt(3)+1;
            switch(randomFabric) {
                case 1:
                    fabricList[n] = new ThinOrangeFactory();
                    break;
                case 2:
                    fabricList[n] = new RedApplesFactory();
                    break;
                case 3:
                    fabricList[n] =  new GreenApplesFactory();
                    break;
                case 4:
                    fabricList[n] = new LongPineapplesFactory();
                    break;
            }
        }
        System.out.println("\n10 Fabrics:");
        System.out.println(Arrays.toString(fabricList));

        Fruit[] fruitList = new Fruit[20];
        for (int n=0; n<10; n++) {
            fruitList[2*n] = fabricList[n].makeFruit();
            fruitList[2*n+1] = fabricList[n].makeFruit();
        }
        System.out.println("\nFruits from 10 fabrics:");
        System.out.println(Arrays.toString(fruitList));
    }
}
