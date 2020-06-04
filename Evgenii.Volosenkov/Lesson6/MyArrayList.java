import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private T [] array;
    private final  int capacity = 10;
    private int size = 0;
    public MyArrayList()
    {
        array = null;
    }
    public void add( T item)
    {
        if( size+1 > capacity)
        {
            throw new MyArrayListStoreException("ArrayList overflow!!! ArrayList may contains 10 items!!!");
        }
        if (array == null)
        {
            array = (T[])new Object[10];
        }
        array[size] = item;
        size++;
    }
    public boolean remove(T item)
    {
        for( int itemInd = 0; itemInd < size; itemInd++)
        {
            if(array[itemInd].equals(item))
            {
                for( int removeInd=itemInd+1; removeInd<size; removeInd++)
                {
                    array[removeInd-1] = array[removeInd];
                }
                size--;
                return true;
            }
        }
        return false;
    }
    public T[] toArray() {
        T[] result = (T[])Arrays.copyOf(array, size);
        return result;
    }

    public int size()
    {
        return size;
    }
    public T get(int ind)
    {
        if(ind>=size)
        {
            throw new MyArrayListProtectedMemory("Attempt to access protected memory!!!");
        }
        return array[ind];
    }
}

