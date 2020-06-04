package Lecture6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArryList <T>{
    Collection <T> myCollection;
    static int collectionSize= 10;

    public MyArryList () {
        myCollection= new ArrayList<T>();
    }

    public MyArryList(Collection<T> myCollection) throws MyArrayStoreException {

        int overSize=(myCollection.size())-collectionSize;
        if((myCollection.size())<=collectionSize) {
            this.myCollection = myCollection;
            System.out.println("Collection size" + (myCollection.size()));
        }

        else {
            Collection<T> bufferCollectionNormal=new ArrayList<>();
            Collection<T> bufferCollectionOver=new ArrayList<>();
            T[] myCollectionArray = (T[]) myCollection.toArray();
            System.out.println("Collection size" + (myCollection.size()));
            for(int i=0;i<collectionSize;i++) {
                bufferCollectionNormal.add(myCollectionArray[i]);
            }
            for(int i=collectionSize;i<(myCollection.size());i++) {
                bufferCollectionOver.add(myCollectionArray[i]);
            }
            this.myCollection=bufferCollectionNormal;
            String overCollection= bufferCollectionOver.toString();
            throw new MyArrayStoreException("Размер переданной в конструктор коллекции больше 10", overCollection,overSize);
        }
    }

    public static int getCollectionSize() {
        return collectionSize;
    }

    @Override
    public String toString() {
        return "MyArryListCollection{" +
                "myCollection=" + myCollection +
                '}';
    }

    void add(Collection<T>myCollection){
        this.myCollection.addAll(myCollection);
    }
    void add(T[]myCollection){
        if(((this.myCollection.size())+(myCollection.length))<=collectionSize) {
            this.myCollection.addAll(Arrays.asList(myCollection));
        }
        else{

            throw new MyArrayStoreException("Невозможно совершить операцию, т.к. после добавления размер коллекции превысит допустимый размер (10)", "",(((this.myCollection.size())+(myCollection.length))-collectionSize));
        }
    }
    void add(T item){
        if(((this.myCollection.size())+1)<=collectionSize) {
            this.myCollection.add(item);
        }
        else{
            throw new MyArrayStoreException("Невозможно совершить операцию, т.к. после добавления размер коллекции превысит допустимый размер (10)", "",1);
        }

    }
    boolean remove(T item){
        if(myCollection.remove(item)){
            return true;
        }
        else{
            return false;
        }
    }
    int size(){
        return myCollection.size();
    }

    public T get (int index){
        Object[] myCollectionArray = myCollection.toArray();
        return (T) myCollectionArray[index];
    }
    T[] toArray(){
        T[] myCollectionArray = (T[]) myCollection.toArray();
        return (T[]) myCollectionArray;

    }

    void delEvenNumbers (){

        myCollection.removeIf(o -> (Integer) o % 2 == 0);
    }
}
