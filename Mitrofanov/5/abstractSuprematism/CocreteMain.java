package abstractSuprematism;

import java.util.ArrayList;
import java.util.List;

public class CocreteMain {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(2, 4, 10));
        figures.add(new Rectangle(-1, 4, 2, 15));
        figures.add(new Circle(-5, -7, 3));
        figures.add(new Rectangle(1, -5, 2, 5));
        figures.add(new Circle(0, 0, 10));
        for (Figure figure : figures) {
            System.out.println("This " + figure.getClassName() + " lays in " +
                    figure.getQuadrant() + " quadrant, area of this figure = " + figure.getSquare());
        }


    }
}
