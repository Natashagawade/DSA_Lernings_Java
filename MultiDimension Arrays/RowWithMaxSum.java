package MultiDimensionArrays;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            int sum = 0 ;
            for(int j=0;j<4;j++){
                sum += arr[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
