package BasicSortingAlgorithms;

public class ReverseSelectionSort {
    public static void main(String[] args) {
        int[] arr={2,7,3,9,4,8,1,5,6};
        int n= arr.length;
        print(arr);
        for(int i=0;i<n-1;i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j=i;j<n;j++){
                if(arr[j]>max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
