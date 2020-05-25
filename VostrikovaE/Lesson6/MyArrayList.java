package VostrikovaE.Lesson6;

import java.util.Arrays;

public class MyArrayList<T>{
   private T[] array =(T[]) new Object[10];

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size() +
                '}';
    }

    public MyArrayList(){
       for(int i=0;i<array.length;i++){
           array[i]=null;
       }
   }
   public void add(T element) {
       if (this.size() == 10) {
           throw new MyArrayStoreException("array is full, element " + element + " not added");
       } else {
           array[size()] = element;
       }
   }

   public boolean remove(T element) {
        boolean isRemoved = false;
        int initialSize = size();
 for(int i =0; i< initialSize; i++) {
     if(array[i].equals(element)) {
         array[i] = null;
         isRemoved = true;
     }
 }
       array=getTrimArray();
 return isRemoved;
   }

   private T[] getTrimArray() {
        T[] copyArray = (T[]) new Object[10];
        int j=0;
        for(int i=0; i<10; i++) {
            if (array[i] != null) {
                copyArray[j] = array[i];
                j++;
            }
        }
        return copyArray;
    }

   public int size(){
       int size=0;
       for(Object element: array){
           if (element!=null) size++;
       }
       return size;
   }

   public T[] toArray() {
       T[] resultArray = (T[]) new Object[this.size()];
       int j = 0;
       for (Object element : array) {
           resultArray[j] = (T) element;
           j++;
       }
       return  resultArray;
   }

   public T get(int index) {
        if (index>=0 & index<size()) {
            return (T) array[index];
        }
else {
    throw new IllegalArgumentException("there is no element with index " + index);
        }
   }
}
