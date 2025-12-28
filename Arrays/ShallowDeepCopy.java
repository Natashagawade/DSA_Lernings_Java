package Arrays;

import java.util.Arrays;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        int[] arr={23,12,56,76,34,23,11};
        int[] x = arr;          //x is shallow copy of arr
        x[0] =100;
        System.out.println(arr[0]);

        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 500;
        System.out.println(arr[0]);
        System.out.println(deep[0]);
    }
}
