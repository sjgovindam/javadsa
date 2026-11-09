//https://www.youtube.com/watch?v=AvPuDl8kVfo&t=13s
package week2_collections.Day4n5;


import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int maxCap;

    // Constructor
    public LRUCache(int capacity) {
        super(capacity, 1.0f, true);
        maxCap = capacity;
    }

    // Remove least recently used entry
    @Override
    protected boolean removeEldestEntry(
            Map.Entry<Integer, Integer> eldest) {

        return size() > maxCap;
    }

    // Get value by key
    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    // Main method
    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println("Cache: " + cache);

        // Access key 1 - makes it most recently used
        System.out.println("Get 1: " + cache.get(1));

        System.out.println("Cache after get(1): " + cache);

        // Insert key 3 - evicts key 2
        cache.put(3, 30);

        System.out.println("Cache after put(3,30): " + cache);

        System.out.println("Get 2: " + cache.get(2));

        // Insert key 4 - evicts key 1
        cache.put(4, 40);

        System.out.println("Cache after put(4,40): " + cache);

        System.out.println("Get 1: " + cache.get(1));
        System.out.println("Get 3: " + cache.get(3));
        System.out.println("Get 4: " + cache.get(4));
    }
}

