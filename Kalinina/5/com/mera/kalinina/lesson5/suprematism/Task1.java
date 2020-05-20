package com.mera.kalinina.lesson5.suprematism;

/*
1. Абстрактный супрематизм
Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
Для описания четверти используйте Enum с четырьями значениями: I,II,III,IV

Создать классы-наследники:
Circle - дополнительный параметр радиус, от 0 до 10
Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
В каждом классе определить метод square, чтобы он правильно считал площадь.
в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
"Название фигуры - площадь"
 */

public class Task1 {

    public static void main(String[] args) {

        Figure[] figureArray = new Figure[5];

        for (int i = 0; i < figureArray.length; i++)
        {
            try {
                if (i % 2 == 0) {
                    figureArray[i] = new Rectangle(i+1, i+2);
                }
                else {
                    figureArray[i] = new Circle(i);
                }
            }
            catch (FigureException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }

        }

        for(Figure figure : figureArray) {
            System.out.println(figure.getClassName() + " - " + String.format("%.2f", figure.square()));
        }
    }
}
