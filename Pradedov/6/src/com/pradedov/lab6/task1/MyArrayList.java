package com.pradedov.lab6.task1;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int MAX_LIST_SIZE = 10;
    private int length;
    private final Object [] items;

    public MyArrayList() {
        items = new Object[MAX_LIST_SIZE];
        length = 0;
    }

    public void add(T item) {
        if (this.length < MAX_LIST_SIZE) {
            this.items[length++] = item;
        }
        else {
            throw new MyArrayStoreException("Attempt to store more elements than class could handle(" + MAX_LIST_SIZE + ")");
        }
    }

    public int size() {
        return this.length;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) items[index];
    }

    @SuppressWarnings("UnusedReturnValue")
    public boolean remove(T item) {
        boolean result = false;

        for (int idx = 0; idx < length; ++idx) {
            if (items[idx].equals(item)) {
                removeItem(idx);
                result = true;
                break;
            }
        }

        return result;
    }

    private void removeItem(int itemIdx) {
        System.arraycopy(items, itemIdx + 1, items, itemIdx, length - itemIdx - 1);
        items[--length] = null;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[]) Arrays.copyOf(items, length);
    }
}

class MyArrayStoreException extends RuntimeException {
    public MyArrayStoreException(String message) {
        super(message);
    }
}