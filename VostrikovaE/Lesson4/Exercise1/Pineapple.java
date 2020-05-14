package VostrikovaE.Lesson4.Exercise1;

import java.util.Random;

public class Pineapple extends Fruit {

    private int topHeight;
    private static Random rnd=new Random();
    public Pineapple(){}
    public Pineapple(int Weight, int topHeight) {
        super(Weight);
        this.setTopHeight(topHeight);
    }

    public int getTopHeight() {
        return topHeight;
    }

    public void setTopHeight(int topHeight) {
        if ((topHeight < 5) || (topHeight > 20)) {
            System.out.println("top height value must be from 5 to 20");
        } else {
            this.topHeight = topHeight;
        }
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "topHeight='" + topHeight +  '\'' + " " +
                "Weight='" + this.getWeight() + '\'' + " " +
                '}';
    }
    public static Pineapple getRandomInstance(){
        Pineapple returnedPineapple=new Pineapple(rnd.nextInt(7)+1, (rnd.nextInt(15)+5));
        return returnedPineapple;
    }
}
