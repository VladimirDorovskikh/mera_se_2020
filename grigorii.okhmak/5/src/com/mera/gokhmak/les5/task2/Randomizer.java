package com.mera.gokhmak.les5.task2;

/**
 * Вспомогательный класс для генерирования случайных комбинаций.
 */
public class Randomizer {

    /**
     * Вернет массив случайных чисел указанной длины.
     *
     * @param seqSize Задает размер возвращаемого массива.
     * @param bounds Задает границы генерируемых случайных чисел персонально для каждого значения в последовательности.
     *               Массив просматривается двойками: первое значение в двойке задает минимальное значение,
     *               второе - максимальное. Если двоек меньше заказанного числа случайных чисел, то будут браться
     *               границы по умолчанию.
     * @return
     */
    static int[] getRandomSequence(final int seqSize, final int... bounds) {
        if (seqSize <= 0) {
            return null;
        }
        int[] result = new int[seqSize];
        int[] pair = new int[2];
        final int boundLength = bounds.length;
        int iter = 0;
        for (int i = 0; i < seqSize; i++) {
            pair[0] = Integer.MIN_VALUE;
            pair[1] = Integer.MAX_VALUE;
            if (iter < boundLength) {
                for (int j = 0; j < 2; j++) {
                    if (iter < boundLength) {
                        pair[j] = bounds[iter++];
                    }
                }
            }
            result[i] = getRandomInRange(pair[0], pair[1]);
        }
        return result;
    }

    /**
     * Возвращает случайное значение в промежутке между \p min и \p max.
     *
     * @param min Минимальное значение в диапазоне.
     * @param max Максимальное значение в диапазоне
     * @return Случайное значение не меньшее, чем \p min и не большее, чем \p max.
     */
    static int getRandomInRange(final int min, final int max) {
        double randomNumber = (Math.random() * ((max - min) + 1)) + min;
        return (int) randomNumber;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(Randomizer.getRandomInRange(0, 2));
        }

        for (int i = -1; i < 6; i++) {
            int[] test = Randomizer.getRandomSequence(i, 0, 1);
            if (test != null) {
                for (int j = 0; j < test.length; j++) {
                    System.out.print(test[j] + " ");
                }
                System.out.println();
            } else {
                System.out.println("have null");
            }
        }
    }

}