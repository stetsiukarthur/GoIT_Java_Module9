package MyHashMap;

public class Entry <K, V>{

    private Entry<K,V> nextEntry;
    private K key;

    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNextEntry() {
        return nextEntry;
    }

    public void setNextEntry(Entry<K, V> nextEntry) {
        this.nextEntry = nextEntry;
    }
}
