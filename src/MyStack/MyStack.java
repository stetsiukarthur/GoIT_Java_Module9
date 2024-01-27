package MyStack;



public class MyStack {

    Object[] arr = new Object[5];
    int count = 0;


    public void expandArr(){
        Object[] expandArr = new Object[arr.length*2];
        for (int i = 0; i<arr.length;i++){
            expandArr[i] = arr[i];
        }
        arr = expandArr;
    }

    public void push(Object value){
        if(arr.length == count) {
            expandArr();
        }
            arr[count] = value;
            count++;
    }

    public boolean remove(int index){
       if(index >= 0 && index  < count){
           for( int i = index; i < arr.length-1;i++){
               arr[i] = arr[i+1];
           }
           arr[arr.length-1] = null;
           count--;

       }else {
           return false;
       }
       return true;
    }

    public Object peek(){
        return arr[count-1];
    }

    public Object pop(){
        if(count == 0){
            return  null;
        }
        Object last =  arr[count-1];
        arr[count-1] = null;
        count--;
        return last;
    }

    public int size(){
        return count;
    }

    public void clear(){
        arr = new Object[5];
        count = 0;
    }

}
