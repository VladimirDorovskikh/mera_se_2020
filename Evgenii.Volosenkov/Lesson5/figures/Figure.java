package figures;

public abstract class Figure {
    protected double x, y;
    private String Name = "";
    public Figure( double x, double y, String Name)
    {
        this.x = x;
        this.y = y;
        this.Name = Name;
    }
    public abstract double square();
    public Quadrant getQuadrant()
    {
        boolean xIsPositive = x>=0.0;
        boolean yIsPositive = y>=0.0;
        if (yIsPositive)
        {
            if (xIsPositive)
            {
                return Quadrant.I;
            }
            else
            {
                return Quadrant.II;
            }
        }
        else
        {
            if (xIsPositive)
            {
                return Quadrant.IV;
            }
            else
            {
                return Quadrant.III;
            }
        }
    }
    public String getName()
    {
        return Name;
    }
}
