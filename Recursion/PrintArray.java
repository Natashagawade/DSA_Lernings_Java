package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {2,54,32,98,69,25,2,45,76,45,9};
        Print(arr, arr.length-1);
    }

    public static void Print(int[] arr, int idx) {
        if(idx==0) return;
        System.out.print(arr[idx]+" ");
        Print(arr,idx-1);
    }
}