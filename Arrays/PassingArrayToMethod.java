package Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {23,23,12,67,54,21};
        System.out.println(arr[2]);
        change(arr);
    }
    public static int change(int[] arr1){
        arr1[2] = 99;
        return arr1[2];
    }
}
