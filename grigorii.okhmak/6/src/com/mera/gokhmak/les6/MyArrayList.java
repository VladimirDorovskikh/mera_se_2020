package com.mera.gokhmak.les6;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class MyArrayList<E extends Comparable<E>> {
    private ArrayList<E> storage = new ArrayList<>();
    private Random rand = new Random();

    public void add(E item) throws MyArrayStoreException {
        int size = storage.size();
        if (size >= 10) {
            throw new MyArrayStoreException("Превышен лимит размера коллекции (>" + size + ").");
        }
        storage.add(item);
    }

    /**
     * Возвращает случайный элемент из коллекции, если она не пустая.
     *
     * @return Случайный элемент коллекции.
     */
    public E select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public E get(int index) {
        return storage.get(index);
    }

    public int size() {
        return storage.size();
    }

    boolean remove(E item) {
        if (storage.isEmpty()) {
            return false;
        }
        ArrayList<E> toRemove = new ArrayList<>();
        for (int i = 0; i < storage.size(); i++) {
            E element = storage.get(i);
            if (element.equals(item)) {
                toRemove.add(element);
            }
        }
        if (toRemove.size() > 0) {
            storage.removeAll(toRemove);
            return true;
        }
        return false;
    }

    boolean remove(Predicate<E> pred) {
        return  storage.removeIf(pred);
    }
}
