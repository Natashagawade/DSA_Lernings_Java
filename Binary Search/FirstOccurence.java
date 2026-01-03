package BinarySearch;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,4,17,17,17,17,17,55,58,58,58,58,59};
        int high = 0;
        int target = 58;
        int low = arr.length-1;
        int index=-1;
        while(high<low){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                low = mid-1;
            }else if(arr[mid]<target){
                high = mid+1;
            }else{
                index = mid;
                high = mid-1;
            }
        }
        System.out.println(index);
    }
}
