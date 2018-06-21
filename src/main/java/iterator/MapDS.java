package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDS implements DataStructure {
    private Map<String, Integer> hmap = new HashMap<>();

    public MapDS() {
        hmap.put("a", 100);
        hmap.put("b", 110);
        hmap.put("c", 200);
    }

    @Override
    public Iterator createIterator() {
        return new MapIterator(hmap);
    }
}
