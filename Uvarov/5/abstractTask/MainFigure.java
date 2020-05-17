package mera.abstractTask;

public class MainFigure {
    public static void main(String[] args) {
        try {
            Figure[] figures = {new Rectangle(0, 0, 4, 5)
                    , new Circle(3, 10, 7)
                    , new Rectangle(-8, -15, 6, 7)
                    , new Circle(4, -1, 5)
                    , new Rectangle(-9, 5, 4, 20)};

            printFigureArray(figures);

        } catch (WrongLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printFigureArray(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName() + " square: " + figure.square());
        }
    }

}
