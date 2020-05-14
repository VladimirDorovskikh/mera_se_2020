package VostrikovaE.Lesson4.Exercise1;

import java.util.Random;

public class Apple extends Fruit{
    private String Colour;
    private static Random rnd=new Random();

    public Apple(){}

    public Apple(int Weight, String Colour) {
        super(Weight);
        this.Colour=Colour;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "Colour='" + Colour + '\'' + " " +
                "Weight='" + this.getWeight() + '\'' + " " +
                '}';
    }
    public static Apple getRandomInstance(){
       Apple returnedApple=new Apple(); // проинициализируем пустым объектом, что не получить null pointer
        switch(rnd.nextInt(3)){
            case 0->returnedApple=new Apple(rnd.nextInt(7)+1,"Red");
            case 1->returnedApple=new Apple(rnd.nextInt(7)+1,"Green");
            case 2->returnedApple=new Apple(rnd.nextInt(7)+1,"Yellow");
        }
        return returnedApple;
    }
}
