import java.util.ArrayList;

public class MyArrayList<T>{
    int max_size = 10;
    final private ArrayList<T> array = new ArrayList<>();

    public void add(T element) {                       //добавляет элемент  в коллекцию
        try {
            if (array.size() < max_size) {             //максимум 10 объектов
                array.add(element);
            } else {
                throw new MyArrayStoreException("");
            }
        } catch (MyArrayStoreException e) {
            System.out.println("\nSize=10. The following element cannot be added - " + element);
        }
    }

    boolean remove(T element) {                 // возвращает true, если элемент был найден и удален
        if (array.contains(element)) {
            array.remove(element);
            if (!array.contains(element)) {
                return true; }
            else { return false; }
        } else {
            return false;
        }
    }

    public T[] toArray(){
        return (T[]) array.toArray();
    }

    public int size(){
        return array.size();
    }

    public T get(int index){
        return array.get(index);
    }


    public String toString() {
        return "MyArrayList: " + "" + array;
    }
}
