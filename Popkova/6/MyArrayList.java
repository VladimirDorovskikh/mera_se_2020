import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T>  {
    private static short MAX_ITEM_VALUE = 10;

    private List<T> list = new ArrayList<>();

    public void add(T item) {
        if(size() != MAX_ITEM_VALUE) {
            list.add(item);
        }
        else {
            throw new MyArrayStoreException("The size of the list has been exceeded");
        }
    }

    public boolean remove(T item) {
        return list.remove(item);
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[])list.toArray();
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }
}