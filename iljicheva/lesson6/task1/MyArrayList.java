package iljicheva.lesson6.task1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MyArrayList<T extends Comparable<T>> {
    private final int size = 10;
    private final ArrayList<T> list;

    public MyArrayList() {
        this.list = new ArrayList<>();
    }

    public int size(){
        return this.list.size();
    }

    public void add(T item){
        if(list.size() < size){
            list.add(item);
        } else {
            throw new  MyArrayStoreExceptoion("Array list is full." +
                    "\nArray List size is " + list.size() +
                    "\n\"" + item.toString() + "\" isn't added.");
        }
    }

    public boolean remove(T item){
        if(list.isEmpty()){
            return false;
        }
        return list.remove(item);
    }

    public boolean remove(Predicate<T> predicate){
        if(list.isEmpty()){
            return false;
        }
        return list.removeIf(predicate);
    }

    public T get(int index){
        if(index < size && index >= 0){
            return list.get(index);
        } else {
            return null;
        }
    }

    public T[] toArray(){
        return list.isEmpty() ? null : (T[]) list.toArray();
    }
}
