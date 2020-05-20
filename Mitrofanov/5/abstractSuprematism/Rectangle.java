package abstractSuprematism;

public class Rectangle extends Figure {
    private int width = 0;
    private int height = 0;

    public Rectangle(int x, int y, int width, int height) throws IllegalArgumentException {
        super(x, y);
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height cannot be negative");
        }
        if (width > 20 || height > 20) {
            throw new IllegalArgumentException("Width and height cannot be grater than 20");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getClassName() {
        return "Rectangle";
    }

    @Override
    double getSquare() {
        return height * width;
    }
}
