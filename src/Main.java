import MyHashMap.MyHashMap;
import MyQueue.MyQueue;
import MyStack.MyStack;



public class Main {
    public static void main(String[] args) {

//        MyArrayList.MyArrayList myArrayList = new MyArrayList.MyArrayList();
//
//        for(int i = 0; i< 11; i++){
//            myArrayList.add(i);
//        }
//        System.out.println(myArrayList.size());
//        System.out.println(myArrayList);
//
//        System.out.println(myArrayList.remove(0));
//        System.out.println(myArrayList);
//
//
//
//        System.out.println(myArrayList.remove(9));
//        System.out.println(myArrayList);
//
//        System.out.println(myArrayList.remove(11));
//        System.out.println(myArrayList);

//        MyHashMap<String,Integer> myHashMap = new MyHashMap();
//
//        myHashMap.put("1",1);
//        myHashMap.put("2",2);
//        myHashMap.put("3",3);
//        myHashMap.put("4",4);
//        myHashMap.put("5",5);
//        myHashMap.put("6",6);
//        myHashMap.put("7",7);
//        myHashMap.put("8",8);
//        myHashMap.put("9",9);
//        myHashMap.put("10",10);
//        myHashMap.put("11",11);
//
//
//        myHashMap.remove("12");
//        myHashMap.remove("7");
//        myHashMap.remove("10");
//
//        System.out.println(myHashMap.get("7"));
//        System.out.println(myHashMap.get("123"));
//        System.out.println(myHashMap.get("10"));
//
//
//        System.out.println(myHashMap.size());
//
//         myHashMap.clear();


//        MyStack myStack = new MyStack();
//
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        myStack.push(6);
//
//        System.out.println(myStack.peek());
//
//        myStack.remove(1);
//        myStack.remove(2);
//
//        int size = myStack.size();
//        for(int i = 0;i<size;i++){
//
//            System.out.println(myStack.pop());
//        }


        MyQueue myQueue = new MyQueue();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        System.out.println("peek "+myQueue.peek());
        System.out.println("size " + myQueue.size());

        int size = myQueue.size();

        for(int i = 0; i<size;i++) {
            System.out.println("pool " + myQueue.pool());
        }

    }
}