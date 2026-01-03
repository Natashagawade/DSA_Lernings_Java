package BasicSortingAlgorithms;

public class KthElementSelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,4,5,2,8,1,2,9,1,0,3};
        int n = arr.length;
        int k = 7;
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j=0;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        System.out.print(k-1);
    }
}
