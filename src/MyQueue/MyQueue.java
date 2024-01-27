package MyQueue;

import org.w3c.dom.Node;

public class MyQueue<T> {

    private NodeQ<T>  head;
    private int size;

     public void add(T value){
         NodeQ nodeQ = new NodeQ();
         nodeQ.setValue(value);

         if(head==null){
             head = nodeQ;
         }else {
             NodeQ<T> current = head;
             while (current.getNext() != null) {

                 current = current.getNext();
             }
             current.setNext(nodeQ);
         }
         size++;
     }

     public  T peek(){
         if(head == null){
             return null;
         }else {
             return head.getValue();
         }
     }

     public T pool(){
         if(head == null){
             return null;
         }else {
             T curHead = head.getValue();
             head = head.getNext();
             size--;
             return curHead;
         }
     }

     public void clear(){
         head = null;
         size = 0;
     }

     public  int size(){
         return size;
     }

}
