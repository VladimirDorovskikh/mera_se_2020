package Lecture6;

import java.util.Collection;

public class MyArrayStoreException  extends RuntimeException {
    private String myCollection;
    private int overSize;

    public int getNumberOverSize() {
        return overSize;
    }

    public String getOverCollection() {
        return  myCollection;
    }



    public MyArrayStoreException(String message, String myCollection, int overSize) {

        super(message);
        this.myCollection = myCollection;
        this.overSize= overSize;

    }
}
