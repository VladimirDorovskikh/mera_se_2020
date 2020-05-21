package com.mera.training.task06;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;


public class MyArrayList<T extends Comparable<T>> {
    private final ArrayList<T> list = new ArrayList<>();

    public void add(T t) throws MyArrayStoreException {
        int size = list.size();
        if (size < 10) {
            list.add(t);
        }
        else {
            throw new MyArrayStoreException("Invalid Storage Size value: " + size + ". Valid values are: 0 - 9.");
        }
    }

    public boolean remove(T t) {
        if (list.isEmpty()) {
            return false;
        }

        ArrayList<T> listToRemove = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            T ts = list.get(i);
            list.removeIf(list -> list.equals(ts));
        }

        return true;
    }

    public boolean remove(Predicate<T> predicate) {
        return list.removeIf(predicate);
    }

    public T[] toArray() {
        if (list.isEmpty()) {
            return null;
        }

        return (T[]) list.toArray();
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public T getRandomItem() {
        return list.get(new Random().nextInt(list.size()));
    }
}
