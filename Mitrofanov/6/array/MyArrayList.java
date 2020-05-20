package array;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {
    int storageSize = 10;
    private List<T> storage = new ArrayList<T>();

    public MyArrayList(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void add(T item) throws MyArrayStoreException {
        if (storage.size() >= storageSize) {
            throw new MyArrayStoreException("Storage is full. Capacity = " + storageSize
                    + ";\n" + item.toString() + " not added.");
        }
        storage.add(item);
    }

    boolean remove(T item) {
        return storage.remove(item);
    }

    boolean remove(List<T> item) {
        return storage.removeAll(item);
    }

    T[] toArray() {
        return (T[]) storage.toArray();
    }

    int size() {
        return storage.size();
    }

    T get(int a) {
        return storage.get(a);
    }

    @Override
    public String toString() {
        return "Storage= " + storage;
    }
}