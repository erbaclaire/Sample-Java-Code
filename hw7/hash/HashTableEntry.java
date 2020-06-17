public class HashTableEntry<K,V> {

    private K key;
    private V value;
    private int hash;

    public HashTableEntry(K key, V value) {
        if (key==null)
            throw new IllegalArgumentException("key cannot be null");
        this.key = key;
        this.value = value;
        this.hash = key.hashCode();
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int getHashCode() {
        return this.hash;
    }

    public String toString() {
        return "{" + key + ": " + value + " (" + hash + ")}";
    }

}
