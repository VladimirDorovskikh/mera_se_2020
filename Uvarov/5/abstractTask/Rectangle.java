package mera.abstractTask;

public class Rectangle extends Figure {
    private static int MAX_LENGTH = 20;
    private static int MIN_LENGTH = 0;

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) throws WrongLengthException {
        super(x, y);
        this.setWidth(width);
        this.setHeight(height);
    }

    public Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (MAX_LENGTH >= width && width >= MIN_LENGTH) {
            this.width = width;
        } else {
            throw new WrongLengthException("Ширина прямоугольника не должна быть: " + width + '\n'
                    + "Ширина должна быть в диапазоне от " + MIN_LENGTH + " до " + MAX_LENGTH + '\n');
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (MAX_LENGTH >= height && height >= MIN_LENGTH) {
            this.height = height;
        } else {
            throw new WrongLengthException("Длина прямоугольника не должна быть: " + height + '\n'
                    + "Длина должна быть в диапазоне от " + MIN_LENGTH + " до " + MAX_LENGTH + '\n');
        }
    }

    @Override
    double square() {
        return width * height;
    }
}
