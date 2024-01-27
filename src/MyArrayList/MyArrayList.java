package MyArrayList;

import java.util.*;

public class MyArrayList  {
    private int[] arr;
    private int size = 10;
    private int count = 0;

    public MyArrayList(){

        arr = new int[size];

    }
    public int size(){

        return count;
    }
    public void add(int value){

        if(count >= size){
            int[] temp = new int[size*2];
            for (int i = 0; i< arr.length;i++){
                temp[i] = arr[i];
            }
            arr = temp;
            size = size*2;
        }

        arr[count] = value;
        count++;
    }

    public void clear(){

        arr = new int[size];
        count = 0;

    }

    public int  get(int index){

        return arr[index];

    }
    @Override
    public String toString(){
        String str = "myArrayList: ";
        for(int  i = 0; i<count-1;i++){
            str += arr[i];
            str += ", ";
        }
        str += arr[count-1];

        return str;
    }

    public boolean remove(int index){
        if(index >= count || index <0){
            return false;
        }
        for(int i = index; i<count;i++) {
            if (i == size - 1) {
                arr[i] = 0;
            }
            arr[i] = arr[i + 1];
        }
        count--;
        return true;
    }



}

