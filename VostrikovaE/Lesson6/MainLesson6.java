package VostrikovaE.Lesson6;


import java.util.Random;

public class MainLesson6 {



    public static void main(String[] args) {
 MyArrayList <Bycicle> arrayBycicle = new MyArrayList<>();
 int bycicleSize = 11;
 System.out.println("create MyArrayList of Bycicles with length " + bycicleSize);
        try {
            for (int i = 0; i < bycicleSize; i++) {
                arrayBycicle.add(Bycicle.getRandomBycicle());
                System.out.println(i + "Element Added: " + arrayBycicle.get(i));
            }
        }
        catch (MyArrayStoreException exception) {
            System.out.println("array is full, cannot add element");
        }
Random rnd = new Random();
  int randomMaxSpeed =rnd.nextInt(45) + 5;
        System.out.println("all bycicles with max speed lower then " + randomMaxSpeed + " will be deleted");
int i=0;
 while (i<arrayBycicle.size()) {
      if (arrayBycicle.get(i).getMaxSpeed() < randomMaxSpeed) {
          arrayBycicle.remove(arrayBycicle.get(i));
      }
      else {i++;}
  }
  System.out.println(arrayBycicle.toString());
    }
}
