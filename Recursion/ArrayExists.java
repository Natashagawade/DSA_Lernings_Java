package Recursion;

public class ArrayExists {
    public static void main(String[] args) {
        int[] arr = {2,54,32,98,69,25,2,45,76,45,9};
        int ele = 25;
        Exists(arr,ele,0);
    }
    public static boolean Exists(int[] arr, int ele, int idx) {
        if (idx == 0) return false;
        if (arr[idx] == ele) return true;
        return Exists(arr, ele, idx + 1);
    }
}
