import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Figure[] figureList = new Figure[5];
        Circle circle1 = new Circle(1,2, new Random().nextInt(10));
        figureList[0] = circle1;
        Circle circle2 = new Circle(2,2, new Random().nextInt(10));
        figureList[1] = circle2;
        Rectangle rectangle1 = new Rectangle(1,2,new Random().nextInt(20),new Random().nextInt(20));
        figureList[2] = rectangle1;
        Rectangle rectangle2 = new Rectangle(-1,1, new Random().nextInt(20),new Random().nextInt(20));
        figureList[3] = rectangle2;
        Rectangle rectangle3 = new Rectangle(-1,-2,new Random().nextInt(20),new Random().nextInt(20));
        figureList[4] = rectangle3;
        System.out.println(Arrays.toString(figureList));
    }

}
