package BasicSortingAlgorithms;
import java.util.Arrays;
public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {7,0,4,3,2,8,6};
        int target = 9;
        Arrays.sort(arr);
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println("Target Found at index " + i + " and " + j);
                break;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else{
                i++;
            }
        }
    }
}
