import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final String modelName[] = {"Aspect", "Forward", "Stinger", "Welt"};
        MyArrayList<Bycicle> bycicleArray = new MyArrayList<Bycicle>();

        for (int i = 0; i < 11; i++) {
            String model = modelName[new Random().nextInt(4)];
            try {
                bycicleArray.add(new Bycicle(model));
            } catch (MyArrayStoreException exception) {
                System.out.println("The following model wasn't added: " + model);
            }
        }

        int randNumber = new Random().nextInt(51);

        for (int i = 0; i < bycicleArray.size(); i++) {
            Bycicle object = bycicleArray.get(i);
            if(object.getMaxSpeed() < randNumber) {
                bycicleArray.remove(object);
                i--;
            }
        }

        MyArrayList<Integer> array = new MyArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(10) + 1;
            array.add(new Integer(num));
        }

        for (int i = 0; i < array.size(); i++) {
            Integer object = array.get(i);
            if (object.intValue() % 2 == 0) {
                array.remove(object);
                i--;
            }
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).intValue() + " ");
        }
    }
}
