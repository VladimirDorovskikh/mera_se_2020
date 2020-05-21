package mera.generics;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int MAX_CAPACITY = 10;
    private Object[] elementsArray;
    private int size;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0 && initialCapacity <= 10) {
            this.elementsArray = new Object[initialCapacity];
        } else {
            throw new MyArrayStoreException("Illegal Capacity: " + initialCapacity + '\n' +
                    "Capacity should be between " + 0 + " and " + MAX_CAPACITY);
        }
    }

    public MyArrayList() {
        this(MAX_CAPACITY);
    }

    public void add(T t) {
        if (size < MAX_CAPACITY) {
            elementsArray[size] = t;
            size++;
        } else {
            throw new MyArrayStoreException("Out of capacity. The number of elements should not be more then " + MAX_CAPACITY);
        }
    }

    public T get(int i) {
        @SuppressWarnings("unchecked") final T element = (T) elementsArray[i];
        return element;
    }

    public int size() {
        return size;
    }

    boolean remove(T t) {
        int i = 0;
        for (; i < elementsArray.length; i++) {
            if (t.equals(elementsArray[i])) {
                break;
            }

            if (i == elementsArray.length - 1) {
                return false;
            }
        }


        final int newSize;
        if ((newSize = size - 1) > i) {
            System.arraycopy(elementsArray, i + 1, elementsArray, i, newSize - i);
        }
        elementsArray[size = newSize] = null;
        return true;
    }

    public <T> T[] toArray() {
        Object[] array = new Object[size];
        if (array.length < size)
            return (T[]) Arrays.copyOf(elementsArray, size, array.getClass());
        System.arraycopy(elementsArray, 0, array, 0, size);
        if (array.length > size)
            array[size] = null;
        return (T[]) array;
    }
}
