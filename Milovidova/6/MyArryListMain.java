package Lecture6;

import java.util.*;
import java.util.function.Predicate;

public class MyArryListMain {
    public static void main (String[] arrgs) {
        //Создайте класс Bycicle/Создайте 11 случайных велосипедов
        Collection<Bycicle> bicyclesCollection = new ArrayList<>();
        String[] modelName = new String[]{"Merida", "GT", "Stels", "Trek", "Cube", "Giant", "Author", "Atom", "Forward", "Haro", "Kross", "Rock Machine", "ССCР"};
        Integer[] maxSpeed = new Integer[]{20, 48, 30, 35, 40, 45, 50, 5, 50, 8, 11};
        //Количество созданных велосипелов будет определяться значением переменной
        int maxNumberBycicles=10;
        Random random = new Random();
        for (int i = 0; i < maxNumberBycicles; i++) {

            bicyclesCollection.add(new Bycicle(modelName[random.nextInt(modelName.length)], maxSpeed[random.nextInt(maxSpeed.length)]));

        }
        System.out.printf("Создана коллекция из %s велосипедов: ", maxNumberBycicles);
        System.out.println(bicyclesCollection.toString());
        int allowableSpeed= random.nextInt(50);
        System.out.printf("Минимальная скорость скорость %s удалим всё, что медленнее \n ", allowableSpeed);
        bicyclesCollection.removeIf(o -> o.maxSpeed < allowableSpeed);

        System.out.println("Коллекция велосипедов, после 'зачистки': " + bicyclesCollection.toString());
        //Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
        //Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
        //Защиту от превышения максимальной длины MyArryList (10) ставила только на конструктор,на Add не ставила
        //одумалась и поставила)

        try {
            MyArryList<Bycicle> bycicleMyArryList = new MyArryList<>(bicyclesCollection);
            System.out.println("Добавили коллекцию велосипедов в MyArryList, bycicleMyArryList.toString: ");
            System.out.println(bycicleMyArryList.toString());

            //- Теперь создайте новый экземпляр MyArrayList - Добавьте в него 10 случайных чисел от 1 до 10
            MyArryList<Integer> integerMyArryList = new MyArryList<>();
            //int maxLenght=50;
            for(int i=0;i<MyArryList.getCollectionSize();i++) {
                integerMyArryList.add((random.nextInt(10)+1));
            }
            System.out.printf("\nНовый экземпляр MyArrayList из %s случайных чисел, integerMyArryList: \n", MyArryList.getCollectionSize());
            System.out.println(integerMyArryList.toString());
            //Проверка на выход за пределы, при добавлении элемента
            //integerMyArryList.add(2);
            //- удалите все четные числа - Выведите оставшиеся числа на экран.
            integerMyArryList.delEvenNumbers();
            System.out.println("\nТолько нечетный integerMyArryList:");
            System.out.println(integerMyArryList.toString());
            //void add(T) - добавляет элемент  в коллекцию
            int num=5;
            integerMyArryList.add(num);
            System.out.printf("\nРезультат работы .add(%s), integerMyArryList: \n",num);
            System.out.println(integerMyArryList.toString());
            Bycicle bycicle2 = new Bycicle("CCCP", 14);
            bycicleMyArryList.add(new Bycicle("CCCP", 14));
            System.out.printf("\nРезультат работы .add(%s), bycicleMyArryList.toString: \n", bycicle2);
            System.out.println(bycicleMyArryList.toString());
            //2. boolean remove(T) - возвращает true, если элемент был найден и удален
            //проверка
            int delItem = 5;
            if (integerMyArryList.remove(delItem)) {
                System.out.printf("элемент %s удален", delItem);
            } else {
                System.out.printf("Элемент %s не найден", delItem);
            }
            delItem = 6;
            if (integerMyArryList.remove(delItem)) {
                System.out.printf("элемент %s удален", delItem);
            } else {
                System.out.printf("Элемент %s не найден", delItem);
            }
            System.out.println("\nКоллекция integerMyArryList после вызова .remove(delItem)");
            System.out.println(integerMyArryList.toString());
            if (bycicleMyArryList.remove(bycicle2)) {
                System.out.printf("элемент %s удален \n", bycicle2);
            }
            System.out.println("Коллекция  bycicleMyArryList.toString после вызова .remove(delItem)");
            System.out.println(bycicleMyArryList.toString());
            //4. int size()
            System.out.println("Проверка .int size() \nbycicleMyArryList.size()" + (bycicleMyArryList.size()));
            System.out.println("integerMyArryList.size()" + (integerMyArryList.size()));
            //5. T get(int) - взять элемент по индексу.
            System.out.printf("Проверка T get(int)\nbycicleMyArryList.get(%s): %s \n",(bycicleMyArryList.size()-1),(bycicleMyArryList.get(bycicleMyArryList.size()-1)));
            System.out.printf("integerMyArryList.get(%s): %s \n",(integerMyArryList.size()-1),(integerMyArryList.get(integerMyArryList.size()-1)));
            //3. T[] toArray() - возвращает массив из всех текущих элементов
            System.out.println("Проверка bycicleMyArryList.toArray()");
            Object[] byciclesArr = bycicleMyArryList.toArray();
            for (int i = 0; i < (byciclesArr.length); i++) {

                System.out.println(byciclesArr[i]);
            }
            System.out.println("Проверка integerMyArryList.toArray()");

            Object[] inteArr = integerMyArryList.toArray();
            for (int i = 0; i < (inteArr.length); i++) {

                System.out.println(inteArr[i]);
            }

        } catch (MyArrayStoreException ex) {

            System.out.println(ex.getMessage());
            System.out.println("Количество элементов, выходящих за пределы допустимой длины " + ex.getNumberOverSize());
            System.out.println("Не добавленнные элементы коллекции" + ex.getOverCollection());
        }

    }
}
