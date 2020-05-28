import figures.Circle;
import figures.Figure;
import figures.Rectangle;

import java.util.Random;

public class figuresMain {
    static Random rand = new Random();
    public static void main(String[] args)
    {
        Figure[] _figures = new Figure[5];
        for(int figInd = 0; figInd<5; figInd++)
        {
            _figures[figInd] = getRandomFigure();
        }
        for(Figure fig:_figures)
        {
            System.out.println( fig.getName() + " - " + fig.square());
        }
    }

    public static Figure getRandomFigure()
    {
        if(rand.nextInt()%2==0)
        {
            return new Circle(rand.nextDouble(), rand.nextDouble(), ((double)rand.nextInt(9999))/1000.0);
        }
        else
        {
            return new Rectangle(rand.nextDouble(), rand.nextDouble(),
                    ((double)rand.nextInt(19999))/1000.0,
                    ((double)rand.nextInt(19999))/1000.0);
        }
    }
}
