/**
 * 1. Абстрактный супрематизм
 * Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
 * В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
 * В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
 * Для описания четверти используйте Enum с четырьями значениями: I,II,III,IV
 *
 * Создать классы-наследники:
 * Circle - дополнительный параметр радиус, от 0 до 10
 * Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
 * В каждом классе определить метод square, чтобы он правильно считал площадь.
 * в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
 * "Название фигуры - площадь"
 */

package Rafis.u5;

import java.awt.*;
import java.util.Random;

public class Problem1 {
    private Random random = new Random();

    class FigureException extends Exception {
        public FigureException() {
            System.out.println("Exception raised:");
        }
    }

    class CircleException extends FigureException {
        private int radius;

        public CircleException(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }
    }

    class RectangleException extends FigureException {
        private int length;
        private int width;

        public RectangleException(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }
    }

    enum Quadrant {I, II, III, IV, None}

    abstract class Figure {
        Point p; // center of figure

        public Figure() {
            p = new Point(random.nextInt(), random.nextInt());
        }

        public abstract double square();

        public Quadrant getQuadrant() {
            Quadrant quadrant = Quadrant.None; // point belongs to origin or to axis

            if (p.x > 0) {
                if (p.y > 0) {
                    quadrant = Quadrant.I;
                }
                else if (p.y < 0) {
                    quadrant = Quadrant.IV;
                }
            } else if (p.x < 0) {
                if (p.y > 0) {
                    quadrant = Quadrant.II;
                }
                else if (p.y < 0) {
                    quadrant = Quadrant.III;
                }
            }

            return quadrant;
        }
    }

    class Circle extends Figure {
        final static int MIN_RADIUS = 0;
        final static int MAX_RADIUS = 10;
        private int radius;

        public Circle(int radius) throws CircleException {
            // considering constraints
            if ((radius >= MIN_RADIUS) && (radius <= MAX_RADIUS)) {
                this.radius = radius;
            }
            else {
                throw new CircleException(radius);
            }
        }

        @Override
        public double square() {
            return Math.PI * radius * radius / 2;
        }
    }

    class Rectangle extends Figure {
        final static int MIN_SIDE = 0;
        final static int MAX_SIDE = 20;
        private int length;
        private int width;

        public Rectangle(int length, int width) throws RectangleException {
            // considering constraints
            if ((length >= MIN_SIDE) && (length <= MAX_SIDE) &&
                    (width >= MIN_SIDE) && (width <= MAX_SIDE)) {
                this.length = length;
                this.width = width;
            }
            else {
                throw new RectangleException(length, width);
            }
        }

        @Override
        public double square() {
            return length * width;
        }
    }

    void doTheJob() {
        try {
            final int FIGURES_NUM = 5;
            Figure[] figures = new Figure[FIGURES_NUM];

            figures[0] = new Circle(1);
            figures[1] = new Circle(4);
            figures[2] = new Circle(6);
            figures[3] = new Rectangle(4, 10);
            figures[4] = new Rectangle(2, 8);

            for (int i = 0; i < FIGURES_NUM; i++) {
                System.out.println(figures[i].getClass().getSimpleName() + " - " + figures[i].square());
            }

            // Both these throw exceptions
            Figure BadCircle = new Circle(-1);
            Figure BadRectangle = new Rectangle(2, 21);
        }
        catch (CircleException cEx) {
            System.out.println("Circle radius " + cEx.radius + " is out of range");
        }
        catch (RectangleException rEx) {
            System.out.println("Rectangle size [" + rEx.length + "," + rEx.width + "] is out of range");
        }
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.doTheJob();
    }
}
