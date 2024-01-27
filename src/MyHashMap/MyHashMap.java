package MyHashMap;

import java.security.Key;

public class MyHashMap<K,V> {

  Entry<K,V>[] entries = new Entry[10];

    private int size;

  public  void put (K key,V value){

   Entry<K,V> newEntry = new Entry<K, V>();
   newEntry.setKey(key);
   newEntry.setValue(value);

   int hash = key.hashCode();
   int bucketIndex = hash%entries.length;

   if(entries[bucketIndex] == null){
    entries[bucketIndex] = newEntry;

   } else {
       Entry<K,V> current = entries[bucketIndex];

    while (current.getNextEntry() != null){

        current = current.getNextEntry();
    }
    current.setNextEntry(newEntry);
   }
      size++;
  }

  public V get(K key){
      int hash = key.hashCode();
      int bucketIndex = hash%entries.length;

      Entry<K,V> current = entries[bucketIndex];

      while (current != null){
            if(current.getKey() == key){
                return current.getValue();
            }
          current = current.getNextEntry();
      }
      return null;
  }

  public void remove(K key){
      int hash = key.hashCode();
      int bucketIndex = hash%entries.length;


      if(entries[bucketIndex].getKey() == key){
          entries[bucketIndex] = entries[bucketIndex].getNextEntry();
          size--;
      } else {
          Entry<K,V> current = entries[bucketIndex];
          while (current.getNextEntry() != null) {
              if(current.getNextEntry().getKey() == key){
                  current.setNextEntry(current.getNextEntry().getNextEntry());
                  size--;
                  return;
              }
              current = current.getNextEntry();
          }

      }
  }


  public void clear(){
      entries = new Entry[10];
          size = 0;
    }

    public int size (){
      return size;
    }

}
