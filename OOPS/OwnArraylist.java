package OOPS;

import java.util.Arrays;

class ArrayList{
    int[] arr;//user defined data structure
    int idx;
    int size = 0;
    ArrayList(int capacity){
        int[] arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){
            int[] arr2 = new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = ele;
        size++;
    }
    int get(int index){
        return arr[index];
    }
    int capacity(){
        return arr.length;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArraylist {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();
    }
}
