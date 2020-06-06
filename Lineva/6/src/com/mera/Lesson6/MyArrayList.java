package com.mera.Lesson6;

import java.util.Arrays;

class MyArrayList<T> {

    private final static int CAPACITY = 10;
    private Object[] items = new Object[CAPACITY];
    private int size = 0;

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public void add(T item) {
        if (size >= CAPACITY) {
            throw new MyArrayStoreException("Can't add item because maximum is reached.");
        }
        items[size++] = item;
    }

    public boolean remove(T item) {
        boolean itemFound = false;

        for (int i = 0; i < size; i++) {
            if ((!itemFound) && (item.equals(items[i]))) {
                itemFound = true;
            }
            if (itemFound) {
                if (i < size - 1) {
                    items[i] = items[i + 1];
                }
            }
        }
        if (itemFound) {
            items[--size] = null;
        }

        return itemFound;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[]) Arrays.copyOf(items, size);
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds for length");
        }
        return (T) items[index];
    }
}

class MyArrayStoreException extends RuntimeException {
    public MyArrayStoreException(String message) {
        super(message);
    }
}