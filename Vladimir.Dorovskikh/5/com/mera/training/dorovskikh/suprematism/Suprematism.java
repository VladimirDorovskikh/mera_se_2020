package com.mera.training.dorovskikh.suprematism;

/**
 * Перечисления, интерфейсы и исключения
 * 1. Абстрактный супрематизм
 * в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
 * "Название фигуры - площадь"
 */
public class Suprematism
{
    static final int FIGURES_NUMBER = 5;
    public static void main(String ... args)
    {
        System.out.println();
        System.out.println("Suprematism");

        Figure[] figureArray = new Figure[FIGURES_NUMBER];
        try
        {
            figureArray[0] = new Circle(1.69299799);
            figureArray[1] = new Circle(5);
            figureArray[2] = new Circle(7);
            figureArray[3] = new Rectangle();
            figureArray[4] = new Rectangle();
        } catch (WrongRadiusException e)
        {
            e.printStackTrace();
        }
        for (Figure figure : figureArray)
        {
            System.out.println(figure.toString());
        }
    }
}
