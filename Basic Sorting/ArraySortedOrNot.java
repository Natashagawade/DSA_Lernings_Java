package BasicSortingAlgorithms;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr ={56,78,8,89,78,8,78};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Sorted Array");
            }else{
                System.out.println("Unsorted Array");
            }
        }
    }
}