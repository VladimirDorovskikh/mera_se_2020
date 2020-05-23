package com.mera.kalinina.lesson6.bikes;

public class MyArrayList<T> {

    private T[] array;
    private int size;

    private static final int MAX_ARRAY_SIZE = 10;
    private static final int DEFAULT_ARRAY_CAPACITY = 5;

    public MyArrayList(int capacity) throws MyArrayStoreException {
        if(capacity > MAX_ARRAY_SIZE) throw new MyArrayStoreException("Max number of elements in array is " + MAX_ARRAY_SIZE);
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public MyArrayList() {
        this(DEFAULT_ARRAY_CAPACITY);
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if(index < size) {
            return array[index];
        }
        else throw new IndexOutOfBoundsException("Index " + index + "is out of range; array size is " + size);
    }

    public void add(T obj) throws MyArrayStoreException {
        if(size < MAX_ARRAY_SIZE) {
            if(array.length > size) {
                array[size++] = obj;
            }
            else {
                T[] tmpArray = array;

                int newArrayCapacity = Math.min((size + DEFAULT_ARRAY_CAPACITY), MAX_ARRAY_SIZE);
                array = (T[]) new Object[newArrayCapacity];
                for(int i = 0; i < size; i++) {
                    array[i] = tmpArray[i];
                }
                array[size++] = obj;
            }
        }
        else throw new MyArrayStoreException("New element couldn't be added to array. The array is already full of elements. Max number of elements in array is " + MAX_ARRAY_SIZE);
    }

    public Object[] toArray() {
        Object[] tmpArray = new Object[size];
        for(int i = 0; i < size; i++) {
            tmpArray[i] = array[i];
        }
        return tmpArray;
    }

    // Returns true, if element was found and removed.
    // It removes first found element.
    public boolean remove(T obj) {
        for (int i = 0; i < size; i++) {
            if(array[i].equals(obj)) {
                array[i] = null;
                for(int j = i; j < size - 1; j++){
                    // swap(array[j + 1], array[j]);
                    T tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
                size--;
                return true;
            }
        }
        return false;
    }
}
