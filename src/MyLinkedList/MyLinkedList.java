package MyLinkedList;

public class MyLinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    private int size;

    public void add(T value) {

        if (firstNode == null) {
            firstNode = new Node<>(null, null, value);
        } else if (lastNode == null) {
            lastNode = new Node<T>(firstNode, null, value);
            firstNode.setNextNode(lastNode);
        } else {

            Node<T> newLastNode = new Node<T>(lastNode, null, value);
            lastNode.setNextNode(newLastNode);
            lastNode = newLastNode;
        }
        size++;
    }

    public T get(int index) {
        if(size > index && index > 0 ){
            Node<T> curNode = firstNode;
            for( int i = 0; i < index;i++){
                curNode = curNode.getNextNode();

            }
            return curNode.getValue();
        } else {
            return null;
        }

    }

    public boolean remove (int index){
        if(size > index && index > 0 ){
            Node<T> curNode = firstNode;
            for(int i = 0; i< index-1;i++){
                curNode = curNode.getNextNode();
            }
            curNode.setNextNode(curNode.getNextNode().getNextNode());
            curNode.getNextNode().getNextNode().setPrevNode(curNode);
            return true;
        } else {
            return  false;
        }

    }

    public  void clear(){
        size = 0;
        firstNode = null;
        lastNode = null;
    }

    public int getSize(){
        return size;
    }
}