package BasicSortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2,0,6};
        print(arr);
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
