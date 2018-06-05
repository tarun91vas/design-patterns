package adapter;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        // Enumeration example
        Vector v = new Vector();
        for (int i = 0; i<10; i++) v.addElement(i);

        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // Iterator example
        ArrayList al = new ArrayList();
        for (int i = 0; i< 10; i++) al.add(i * 10);

        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Use iterator with Vector ? Adapter class for the conversion
        EnumIteratorAdapter enumIteratorAdapter = new EnumIteratorAdapter(v.elements());

        while(enumIteratorAdapter.hasNext()) {
            System.out.println(enumIteratorAdapter.next());
        }

        // must throw UnsupportedOperationException
        enumIteratorAdapter.remove();
    }
}
