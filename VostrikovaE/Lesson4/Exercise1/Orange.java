package VostrikovaE.Lesson4.Exercise1;

import java.util.Random;

public class Orange extends Fruit {
    private int Peel;
    private static Random rnd=new Random();

    public Orange(){}
    public Orange(int Weight, int Peel) {
        super(Weight);
        this.setPeel(Peel);
    }

    public int getPeel() {
        return Peel;
    }

    public void setPeel(int peel) {
        if ((peel <0) || (peel > 20)) {
          System.out.println("Peel value must be from 0 to 20");
        } else {
            Peel = peel;
        }
    }

    @Override
    public String toString() {
        return "Orange{" +
                "Peel=" + Peel + '\'' + " " +
                "Weight='" + this.getWeight() + '\'' + " " +
                '}';
    }

    public static Orange getRandomInstance(){
        Orange returnedOrange=new Orange(rnd.nextInt(7)+1, rnd.nextInt(20));
          return returnedOrange;
    }

}
