package VostrikovaE.Lesson5.Excercise1;


abstract public class Figure {
    private double middleX;
    private double middleY;

    public void setMiddleX(double middleX) {
        this.middleX = middleX;
    }

    public void setMiddleY(double middleY) {
        this.middleY = middleY;
    }

    abstract public double square();
    abstract public String getFigureName();

    public Quadrant getQuadrant() {
        int isPositiveX = (middleX > 0) ? 1 : 0;
        int isPositiveY = (middleY > 0) ? 1 : 0;
        Quadrant returnedValue=null;
        if (middleX*middleY==0){
            int isXzero=(middleX==0) ? 1 : 0;
            int isYzero=(middleY==0) ? 1 : 0;
            switch(isXzero*2+isYzero) {
                case 1: returnedValue = Quadrant.axisX;
                break;
                case 2: returnedValue = Quadrant.axisY;
                break;
                case 3: returnedValue = Quadrant.zero;
                break;
            }
        } else {
            switch (isPositiveX * 2 + isPositiveY) {
                case 3:
                    returnedValue = Quadrant.I;
                    break;
                case 2:
                    returnedValue = Quadrant.IV;
                    break;
                case 1:
                    returnedValue = Quadrant.II;
                    break;
                case 0:
                    returnedValue = Quadrant.III;
                    break;

            }
        }
        return returnedValue;
    }
}