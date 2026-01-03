package BasicSortingAlgorithms;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr= {3,0,2,1,0,7,5,4,0,6};
        for(int i=0;i<arr.length-1;i++){
            boolean isSorted = true;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted){
                break;
            }
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
