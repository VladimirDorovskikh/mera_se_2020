public class Main {
    private final static int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        makeFigureArray(figures);
        printFigures(figures);
    }

    private static void makeFigureArray(Figure[] figures) {
        for(int i = 0; i < figures.length; i++) {
            if(i % 2 == 0) {
                figures[i] = new Circle();
            }
            else {
                figures[i] = new Rectangle();
            }
        }
    }

    private static void printFigures(Figure[] figures) {
        for(int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getClass().getSimpleName() + " - " + figures[i].square());
        }
    }
}
