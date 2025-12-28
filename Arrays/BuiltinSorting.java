package Arrays;
import java.util.Arrays;
public class BuiltinSorting {
    public static void main(String[] args) {
        int[] arr = {4,-5,12,53,-45,-31,22,89};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}