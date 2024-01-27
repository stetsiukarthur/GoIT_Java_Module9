package MyQueue;

public class NodeQ<T> {

   private NodeQ<T> prev;

   private NodeQ<T> next;

   private T value;

    public NodeQ<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeQ<T> prev) {
        this.prev = prev;
    }

    public NodeQ<T> getNext() {
        return next;
    }

    public void setNext(NodeQ<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
