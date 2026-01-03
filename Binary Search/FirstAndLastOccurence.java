package BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,4,4,5,5,5,5};
        int x=4;
        int low = 0;
        int high = arr.length-1;
        int index=-1;
        int index2 = -1;
        int[] myList = new int[2];
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                index = mid;
                high = mid-1;
            }
        }
        myList[0]=index;

        low = 0;
        high = arr.length - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                index2 = mid;
                low = mid+1;
            }
        }
        myList[1]=index2;
        System.out.print(myList[0]+ " " + myList[1]);
    }
}
