package BasicSortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,2,4,6,3,9};
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
    }
}
