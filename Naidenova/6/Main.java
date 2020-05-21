import java.util.Random;

public class Main {

    public static void main(String[] args){
        System.out.println("Bicycles");
        MyArrayList<Bicycle> bicycleList = new MyArrayList<>();
        String[] modelNames = {"Atom", "Benelli", "Cinelli", "Dahon", "Electra", "Focus", "Ghost", "Haro", "Izh-bike", "Kross"};
        Bicycle[] a_bicycle = new Bicycle[11];
        for (int n=0; n<11; n++) {
            a_bicycle[n] = new Bicycle(modelNames[new Random().nextInt(10)], new Random().nextInt(45)+5) ;
            bicycleList.add(a_bicycle[n]);
        }
        System.out.println("Bicycle list size = " + bicycleList.size());

        //a_bicycle12 is created to verify BicycleSpeedException
        Bicycle a_bicycle12 = new Bicycle(modelNames[new Random().nextInt(10)], 2) ;
        bicycleList.add(a_bicycle12);

        int randomDigit = new Random().nextInt(50);
        System.out.println("Need to remove all elements with max speed < "+randomDigit);
        for (int n=0; n<bicycleList.size(); n++) {
            if (a_bicycle[n].getMaxSpeed() < randomDigit) {
                bicycleList.remove(a_bicycle[n]);
                System.out.println("The following element has been removed: " + a_bicycle[n]);
            }
        }
        System.out.println("Size after removing = " + bicycleList.size());
        System.out.println(bicycleList);

        System.out.println("\nRandom numbers");
        MyArrayList<Integer> digits = new MyArrayList<>();
        for (int n=0;n<10;n++) {
            int digit = new Random().nextInt(9)+1;
            digits.add(digit);
        }
        System.out.println(digits);
        //digits.remove(digits.get(n));
        for (int n=0;n<digits.size();n++) {
            int even = digits.get(n);
            if ( even % 2 ==0) {
                System.out.println("Need to remove " + n + " element: " + even);
                digits.remove(n);
            }
        }
        System.out.println("Array after even removing  " + digits);
    }
}
