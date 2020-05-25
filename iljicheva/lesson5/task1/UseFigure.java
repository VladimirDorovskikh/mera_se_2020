package iljicheva.lesson5.task1;

public class UseFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        for(int i = 0; i < figures.length; i++){
            figures[i] = new Circle();
            if(i<4){
                figures[++i] = new Rectangle();
            }
        }
        for (Figure figure : figures){
            System.out.println(figure.toString());
        }
    }
}
