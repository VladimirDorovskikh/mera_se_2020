public abstract class Figure {
    private int x;
    private int y;
    enum Quadrants {NO_QUADRANT, FIRST_QUADRANT, SECOND_QUADRANT, THIRD_QUADRANT, FOURTH_QUADRANT};

    public abstract double square();

    public Quadrants getQuadrant() {
        Quadrants quadrant;
        if(x > 0 & y > 0) {
            quadrant = Quadrants.FIRST_QUADRANT;
        }
        else if(x < 0 & y > 0) {
            quadrant = Quadrants.SECOND_QUADRANT;
        }
        else if(x < 0 & y < 0) {
            quadrant = Quadrants.THIRD_QUADRANT;
        }
        else if(x > 0 & y < 0) {
            quadrant = Quadrants.FOURTH_QUADRANT;
        }
        else {
            quadrant = Quadrants.NO_QUADRANT;
        }
        return quadrant;
    }
}
