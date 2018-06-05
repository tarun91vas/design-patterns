package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumIteratorAdapter implements Iterator<Object> {
    Enumeration<Object> e;

    EnumIteratorAdapter(Enumeration en) {
        this.e = en;
    }

    public boolean hasNext() {
        return e.hasMoreElements();
    }

    public Object next() {
        return e.nextElement();
    }

}
