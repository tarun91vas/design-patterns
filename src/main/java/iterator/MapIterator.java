package iterator;

import java.util.*;

public class MapIterator implements Iterator {
    private Map<String, Integer> hmap = new HashMap<>();
    private Set<String> keys = new HashSet<>();

    public MapIterator(Map<String, Integer> hm) {
        this.hmap = hm;
        this.keys = hm.keySet();
    }

    @Override
    public boolean hasNext() {
        if (keys.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object[] keyArr = keys.toArray();
        Integer val = hmap.get(keyArr[0]);
        keys.remove(keyArr[0]);
        return val;
    }
}
