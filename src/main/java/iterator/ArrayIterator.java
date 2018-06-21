package iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator {
    private Integer[] intArr;
    private int ctr = 0;

    public ArrayIterator(Integer[] arr) {
        this.intArr = arr;
    }

    @Override
    public boolean hasNext() {
        if (ctr < intArr.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Integer val =  intArr[ctr];
        ctr++;
        return val;
    }
}
