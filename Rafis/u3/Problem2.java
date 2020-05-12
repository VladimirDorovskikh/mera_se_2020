/**
 * Задание 2. Случайности - не случайны
 * Создать класс SequentialRandom с одним полем типа int.
 * Значение поле можно только прочитать, но не изменить (используйте модифиактор private на поле и создайте только getter)
 * Значение этого int вычисляется по следующим правилом:
 * - Значение для первого созданного объекта - случайное
 * - значение для каждого следующего на 1 больше, чем предыдущее
 * - У класса есть статический метод resetRandom(), который делает значение следующего созданного объекта - случайным.
 *
 * Например
 * new SequentialRandom() // содержит 5 (случайное)
 * new SequentialRandom() // содержит 6 (на 1 больше)
 * new SequentialRandom() // содержит 7 (на 1 больше)
 * SequentialRandom.resetRandom()
 * new SequentialRandom() // содержит 42 (случайное
 * new SequentialRandom() // содержит 43) (на 1  больше)
 *
 * Подсказка: Используйте статическую переменную в классе, чтобы хранить значение предыдущего объекта.
 */

package Rafis.u3;

import java.util.Random;

public class Problem2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(new SequentialRandom().getNum());
        }
        SequentialRandom.resetRandom();
        for (int i = 0; i < 3; i++) {
            System.out.println(new SequentialRandom().getNum());
        }
    }
}

class SequentialRandom {
    private int num;
    static private Integer previous;

    static private Random rnd = new Random();

    SequentialRandom() {
        if (previous == null) {
            previous = rnd.nextInt();
        } else {
            previous++;
        }
        num = previous;
    }

    int getNum() {
        return num;
    }

    static void resetRandom() {
        previous = null;
    }
}