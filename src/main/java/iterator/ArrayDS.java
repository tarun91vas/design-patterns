package iterator;


import java.util.Iterator;

public class ArrayDS implements DataStructure {
    private Integer[] scores = new Integer[10];

    public ArrayDS() {
        for (int i = 0;  i < 10; i++) {
            scores[i] = i * 10;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(scores);
    }
}
