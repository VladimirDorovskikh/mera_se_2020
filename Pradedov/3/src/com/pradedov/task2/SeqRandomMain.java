package com.pradedov.task2;
/*
Задание 2. Случайности - не случайны
Создать класс SequentialRandom с одним полем типа int.
Значение поле можно только прочитать, но не изменить (используйте модификатор private на поле и создайте только getter)
Значение этого int вычисляется по следующим правилом:
- Значение для первого созданного объекта - случайное
- значение для каждого следующего на 1 больше, чем предыдущее
- У класса есть статический метод resetRandom(), который делает значение следующего созданного объекта - случайным.

Например
new SequentialRandom() // содержит 5 (случайное)
new SequentialRandom() // содержит 6 (на 1 больше)
new SequentialRandom() // содержит 7 (на 1 больше)
SequentialRandom.resetRandom()
new SequentialRandom() // содержит 42 (случайное
new SequentialRandom() // содержит 43) (на 1  больше)
 */

public class SeqRandomMain {
    private static final int NUM_OF_TRIES = 5;

    public static void main(String[] args) {

        for (int idx = 0; idx < NUM_OF_TRIES; ++idx) {
            new SequentialRandom();
            System.out.println("Current objects counter: " + SequentialRandom.getObjectsCounter());
        }

        SequentialRandom.resetRandom();

        for (int idx = 0; idx < NUM_OF_TRIES; ++idx) {
            new SequentialRandom();
            System.out.println("Current objects counter: " + SequentialRandom.getObjectsCounter());
        }
    }
}
