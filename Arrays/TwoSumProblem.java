package Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2,34,32,3,78,56,43,1,19,93,17};
        int sum = 57;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Elements found at index:" + i + " " + j);
                    break;
                }
            }
        }
    }
}
