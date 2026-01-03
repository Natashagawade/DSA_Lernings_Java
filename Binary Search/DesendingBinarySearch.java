package BinarySearch;

public class DesendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {54,43,42,41,31,30,22,21,15,13,8,4,2};
        int high = 0;
        int target = 31;
        int low = arr.length-1;
        while(high<low){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high = mid+1;
            }else if(arr[mid]<target){
                low = mid-1;
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
