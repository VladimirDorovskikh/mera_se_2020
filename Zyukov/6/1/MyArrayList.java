import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {
    final private static int MAX_OBJECTS = 10;
    private int objects_count = 0;
    private List<T> array = new ArrayList<>(MAX_OBJECTS);

    public void add(T object) {
        if (objects_count < 10) {
            array.add(object);
            objects_count++;
        } else {
            throw new MyArrayStoreException();
        }
    }

    public boolean remove(T object) {
        return array.remove(object);
    }

    public Object[] toArray() {
        return array.toArray();
    }

    public int size() {
        return array.size();
    }

    public T get(int index) {
        return array.get(index);
    }
}
