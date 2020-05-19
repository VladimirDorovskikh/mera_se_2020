package com.pradedov.task1;
/*
Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
Для описания четверти используйте Enum с четырьмя значениями: I,II,III,IV

Создать классы-наследники:
Circle - дополнительный параметр радиус, от 0 до 10
Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
В каждом классе определить метод square, чтобы он правильно считал площадь.
в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
"Название фигуры - площадь"
 */
public class FigureMain {

    public static void main(String [] args) {
        try {
            Figure [] figures = { new Circle(new Dot(0.2, -6.1), 8),
                    new Circle(8),
                    new Circle(),
                    new Rectangle(new Dot(-1, 0.5),2,5),
                    new Rectangle(2,5),
                    new Rectangle(),
            };

            for (Figure figure: figures) {
                System.out.println(figure.toString() + "; Center is in " + figure.getQuadrant().getQuadrantAsString());
            }
        }
        catch (InvalidRadiusException | InvalidRectangleException ex) {
            System.out.println("Failed to create Figure object due to exception: " + ex.toString());
        }
        catch (Exception ex) {
            System.out.println("Something else went wrong: " + ex);
        }
    }
}
