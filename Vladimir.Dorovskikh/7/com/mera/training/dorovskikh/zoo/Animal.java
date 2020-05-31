package com.mera.training.dorovskikh.zoo;

import java.util.Objects;
import java.util.Random;

/**
 * - Создать абстрактный класс Animal с полем для имени (name - String) и абстрактным методом getFavoriteMeal() - который возвращает любимую еду животного.
 */
public abstract class Animal
{
    String name;

    Animal()
    {
        String[] names = {"Барсик","Зуб","Нос","Рваное ухо","Соня","Дарси","Мурка","Белый клык","Лаки"};
        name = names[new Random().nextInt(names.length)];
    }
    public abstract String getFavoriteMeal();

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() +
                " " + name +
                " likes to eat " +
                getFavoriteMeal();
    }
}
