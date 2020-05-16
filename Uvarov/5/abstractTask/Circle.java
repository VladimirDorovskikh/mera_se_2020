package mera.abstractTask;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private static double MAX_RADIO = 20;
    private static double MIN_RADIO = 0;

    double radio;

    public Circle(int x, int y, double radio) throws WrongLengthException {
        super(x, y);
        this.setRadio(radio);
    }

    public Circle(double radio) {
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (MAX_RADIO >= radio && radio >= MIN_RADIO) {
            this.radio = radio;
        } else {
            throw new WrongLengthException("Длина радиуса не должна быть: " + radio + '\n'
                    + "Длина радиуса должна быть в диапазоне от " + MIN_RADIO + " до " + MAX_RADIO + '\n');
        }
    }

    @Override
    double square() {
        return PI * Math.pow(radio, 2);
    }
}
