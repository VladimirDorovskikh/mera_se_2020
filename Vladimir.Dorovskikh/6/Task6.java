import com.mera.training.dorovskikh.storage.Bycicle;
import com.mera.training.dorovskikh.storage.MyArrayList;
import com.mera.training.dorovskikh.storage.MyArrayStoreException;

import java.util.Random;

/**
 * Дженерики и коллекции
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
 *
 * - Теперь создайте новый экземпляр MyArrayList
 * - Добавьте в него 10 случайных чисел от 1 до 10
 * - удалите все четные числа
 * - Выведите оставшиеся числа на экран.
 */
public class Task6
{
    public static void main(String[] args)
    {
        MyArrayList<Bycicle> bycicleMyArrayList = new MyArrayList<>();
        Bycicle.refillStock(bycicleMyArrayList);

        MyArrayList.printMyArrayList(bycicleMyArrayList);

        Bycicle.removeSlow(bycicleMyArrayList, new Random().nextInt(51));
        MyArrayList.printMyArrayList(bycicleMyArrayList);

        MyArrayList<Integer> myNumbersList = new MyArrayList<>();
        produceNumbersList(myNumbersList);
        MyArrayList.printMyArrayList(myNumbersList);

        try
        {
            int i = 0;
            do
            {
                Integer tempNumber = myNumbersList.get(i);

                if ((tempNumber%2) == 0)
                {
                    myNumbersList.remove(tempNumber);
                }
                else
                {
                    ++i;
                }
            } while (i < myNumbersList.size());
        } catch (MyArrayStoreException e)
        {
            e.printStackTrace();
        }
        MyArrayList.printMyArrayList(myNumbersList);
    }

    private static void produceNumbersList(MyArrayList<Integer> myNumbersList)
    {
        Random r = new Random();
        for (int i = 0; i < 10; i++)
        {
            try
            {
                myNumbersList.add(r.nextInt(10)+1);
            } catch (MyArrayStoreException e)
            {
                System.out.println("New int doesn't feet MyArrayList.");
                break;
            }
        }
    }
}
