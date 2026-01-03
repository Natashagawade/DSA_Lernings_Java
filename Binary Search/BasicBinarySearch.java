package BinarySearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12,14,15,17,20,26,29,34,37,39,41,42,46,49,52,55,58,59,61,66,68,70,73,76,79,81,82,85,90,99,100};
        int high = 0;
        int target = 58;
        int low = arr.length-1;
        while(high<low){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                low = mid-1;
            }else if(arr[mid]<target){
                high = mid+1;
            } else if(arr[mid]==target){
                System.out.println("Element found at index "+mid);
                break;
            }else{
                System.out.println("Element not present in Array");
                break;
            }
        }
    }
}