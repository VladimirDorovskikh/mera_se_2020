/**
 * Дженерики и коллекции
 * (пожалуйста, делайте каждое задание в отдельном package'e)
 * Задание 1. Велосипеды и контейнеры
 * Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
 * Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
 * Используйте обощенный класс для этого (generic) с типом T.
 * - Реализуйте методы:
 * 1. void add(T) - добавляет элемент  в коллекцию
 * 2. boolean remove(T) - возвращает true, если элемент был найден и удален
 * 3. T[] toArray() - возвращает массив из всех текущих элементов
 * 4. int size()
 * 5. T get(int) - взять элемент по индексу.
 *
 * - Создайте класс Bycicle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
 * Переопределите equals и hashCode, который используют оба свойства велосипеда.
 * - Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
 *  Если какой-то велосипед добавить не получилось - то в лог выведите какой велосипед не добавился.
 * - Проверьте, что все методы работают правильно:
 *   1. Возьмите случайное число от 0 до 50.
 *   2. Удалите из коллекции все велосипеды со скоростью меньше этого случайного числа.
 *
 * - Теперь создайте новый экземпляр MyArrayList
 * - Добавьте в него 10 случайных чисел от 1 до 10
 * - удалите все четные числа
 * - Выведите оставшиеся числа на экран.
 */

package Rafis.u6;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;

public class Problem1 {
    static final Random random = new Random();

    class MyArrayStoreException extends Exception {
        private int length;

        public MyArrayStoreException(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }
    }

    public class MyArrayList<E> {
        static final int ARR_LENGTH = 10;
        private Object[] arr;
        int size;

        MyArrayList() {
            arr = new Object[ARR_LENGTH];
        }

        public void add(E e) throws MyArrayStoreException {
            if (size == ARR_LENGTH) {
                throw new MyArrayStoreException(size+1);
            }
            arr[size++] = e;
        }

        @SuppressWarnings("unchecked")
        boolean remove(E e) {
            boolean isExist = false;

            for (int i = 0; i < size; i++) {
                if (e == (E)arr[i]) {
                    isExist = true;
                    for (int j = i; j < size -1; j++) {
                        arr[j] = arr[j+1];
                    }
                    arr[--size] = null;
                    break;
                }
            }

            return isExist;
        }

        @SuppressWarnings("unchecked")
        public E[] toArray() {
            if (arr == null || size == 0) {
                return null;
            }
            final E[] res = (E[]) Array.newInstance(arr[0].getClass(), size);
            for (int i = 0; i < size; i++) {
                res[i] = (E) arr[i];
            }
            return res;
        }

        public int size() {
            return size;
        }

        @SuppressWarnings("unchecked")
        public E get(int index) {
            return (E)arr[index];
        }
    }

    class NonexistentBike extends Exception {
        private int speed;

        public NonexistentBike(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }
    }

    class Bicycle {
        String modelName;
        int maxSpeed;
        final static int MIN_SPEED = 5;
        final static int MAX_SPEED = 50;

        public Bicycle(String modelName, int maxSpeed) throws NonexistentBike {
            if ((maxSpeed >= MIN_SPEED) && (maxSpeed <= MAX_SPEED)) {
                this.modelName = modelName;
                this.maxSpeed = maxSpeed;
            } else {
                throw new NonexistentBike(maxSpeed);
            }
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bicycle bicycle = (Bicycle) o;
            return maxSpeed == bicycle.maxSpeed &&
                    Objects.equals(modelName, bicycle.modelName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(modelName, maxSpeed);
        }

        @Override
        public String toString() {
            return "Bicycle{" +
                    "modelName='" + modelName + '\'' +
                    ", maxSpeed=" + maxSpeed +
                    '}';
        }
    }

    final static String[] BIKE_MODELS = {"Schwinn", "Mongoose", "Avalon", "Marin", "Lemond", "Aist", "Stels"};

    void doTheJob() {
        final int BIKE_NUM = 10;
        MyArrayList<Bicycle> bicycles = new MyArrayList<>();

        // create and print 10 (for instance) random bikes with random max speed in range [5;50]
        System.out.println(" ## doTheJob ##\n");

        for (int i = 0; i < BIKE_NUM+1; i++) {
            try {
                bicycles.add(new Bicycle(BIKE_MODELS[random.nextInt(BIKE_MODELS.length)],
                        random.nextInt(Bicycle.MAX_SPEED - Bicycle.MIN_SPEED + 1) + Bicycle.MIN_SPEED));
                System.out.println((i+1) + ": " + bicycles.get(i));
            } catch (MyArrayStoreException e) {
                System.out.println(">> Out of max length. Current: " + e.getLength());
            } catch (NonexistentBike e) {
                System.out.println("Unsupported bike with speed: " + e.getSpeed());
            }
        }

        final int MAX_SPEED = 50;
        int randSpeed = random.nextInt(MAX_SPEED+1); // [0;50]

        // delete all bikes with speed lower than "randSpeed"
        for (int i = 0; i < bicycles.size(); i++) {
            if (bicycles.get(i).getMaxSpeed() < randSpeed) {
                bicycles.remove(bicycles.get(i--)); // remove elem and decrease the counter
            }
        }

        System.out.println("\n Bikes with speed higher than " + randSpeed + " : \n");
        for (int i = 0; i < bicycles.size(); i++) {
            System.out.println((i+1) + ": " + bicycles.get(i));
        }
    }

    void playWithDigits() {
        final int ARR_NUM = 10;
        final int MIN_VAL = 1;
        final int MAX_VAL = 10;
        MyArrayList<Integer> arr = new MyArrayList<>();

        // create and print 10 (for instance) Integers in range [1;10]
        System.out.println("\n ## playWithDigits ##\n");

        for (int i = 0; i < ARR_NUM; i++) {
            try {
                arr.add(random.nextInt(MAX_VAL) + MIN_VAL);
                System.out.println((i+1) + ": " + arr.get(i));
            } catch (MyArrayStoreException e) {
                System.out.println(">> Out of max length. Current: " + e.getLength());
            }
        }

        // delete all even numbers
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(arr.get(i--)); // remove elem and decrease the counter
            }
        }

        System.out.println("\n Only odd numbers: \n");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((i+1) + ": " + arr.get(i));
        }
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.doTheJob();
        p.playWithDigits();
    }
}
