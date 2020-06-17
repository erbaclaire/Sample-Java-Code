import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class HashTable<K,V> {

    private Object[] entries;

    private List<HashTableEntry<K,V>> bucket(int i) {
        return (List<HashTableEntry<K,V>>)entries[i];
    }

    public HashTable(int numBuckets) {
        if (numBuckets<1)
            throw new IllegalArgumentException("hash table must have at least one bucket");
        this.entries = new Object[numBuckets];
        for (int i=0; i<numBuckets; i++)
            this.entries[i] = new LinkedList<HashTableEntry<K,V>>();
    }

    public void put(K key, V value) {
        HashTableEntry<K,V> e = new HashTableEntry<K,V>(key,value);
        int h = e.getHashCode();
        int b = Math.abs(h % this.entries.length);
        bucket(b).add(e);
    }

    public V get(K key) {
        int h = key.hashCode();
        int b = Math.abs(h % this.entries.length);
        for (HashTableEntry<K,V> e : bucket(b))
            if (key.equals(e.getKey()))
                return e.getValue();
        return null;
    }

    public boolean includesKey(K key) {
        return this.get(key)==null ? false : true;
    }

    public boolean includesValue(V value) {
        for (int i=0;i<this.entries.length;i++) 
            for (HashTableEntry<K,V> e : bucket(i))
                if (value.equals(e.getValue()))
                    return true;
        return false;
    }

    public List<K> keys() {
        List<K> keyList = new LinkedList<K>();
        for (int i=0;i<this.entries.length;i++) 
            for (HashTableEntry<K,V> e : bucket(i))
                keyList.add(e.getKey());
        return keyList;
    }

    public List<V> values() {
        List<V> valueList = new LinkedList<V>();
        for (int i=0;i<this.entries.length;i++) 
            for (HashTableEntry<K,V> e : bucket(i))
                valueList.add(e.getValue());
        return valueList;
    }

    public double loadFactor() {
        double bucketLoadSum = 0;
        for (int i=0;i<this.entries.length;i++) {
            int bucketLoad = 0;
            for (HashTableEntry<K,V> e : bucket(i)) {
                bucketLoad++;
            }
            bucketLoadSum += bucketLoad;
        }
        return bucketLoadSum/this.entries.length;
    }

    public int numCollisions() {
        int collisions = 0;
        for (int i=0;i<this.entries.length;i++) {
            int bucketLoad = 0;
            for (HashTableEntry<K,V> e : bucket(i)) {
                bucketLoad++;
            }
            if (bucketLoad>1) {
                collisions++;
            }
        }
        return collisions;
    }

    public int numEmptyBuckets() {
        int emptyBuckets = 0;
        for (int i=0;i<this.entries.length;i++) {
            int bucketLoad = 0;
            for (HashTableEntry<K,V> e : bucket(i)) {
                bucketLoad++;
            }
            if (bucketLoad==0) {
                emptyBuckets++;
            }
        }
        return emptyBuckets;
    }

    public int maxBucket() {
        int max = 0;
        for (int i=0;i<this.entries.length;i++) {
            int bucketLoad = 0;
            for (HashTableEntry<K,V> e : bucket(i)) {
                bucketLoad++;
            }
            if (bucketLoad>max) {
                max = bucketLoad;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        HashTable<String,Integer> tbl = new HashTable<String,Integer>(5);
        tbl.put("A",1);
        tbl.put("C",11);
        tbl.put("B",2);
        tbl.put("E",2);
        tbl.put("F",9);
        tbl.put("Z",3);
        tbl.put("Z",3);
        tbl.put("XS",1);
        tbl.put("REALLLLLYYYSBDSNLAIJJDAJPO",105);

        System.out.println("*****START TB1*****");
        System.out.println("A: "+tbl.get("A"));
        System.out.println("C: "+tbl.get("C"));
        System.out.println("B: "+tbl.get("B"));
        System.out.println("D: "+tbl.get("D"));
        System.out.println("tb1 includes key B?: "+tbl.includesKey("B"));
        System.out.println("tb1 includes key D?: "+tbl.includesKey("D"));
        System.out.println("tb1 includes value 4?: "+tbl.includesValue(4));
        System.out.println("tb1 includes value 2?: "+tbl.includesValue(2));
        System.out.println("tb1 keys: "+tbl.keys());
        System.out.println("tb1 values: "+tbl.values());
        System.out.println("tb1 loadfactor: "+tbl.loadFactor());
        System.out.println("tb1 buckets with collisions: "+tbl.numCollisions());
        System.out.println("tb1 buckets that are empty: "+tbl.numEmptyBuckets());
        System.out.println("tb1 number of items in bucket with most items: "+tbl.maxBucket());
    
    }

}
