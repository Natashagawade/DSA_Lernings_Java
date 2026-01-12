package MultiDimensionArrays;

public class MinElementFromMaxOfRows {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            int maxSum = Integer.MIN_VALUE;
            int sum =0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
                maxSum = Math.max(maxSum, sum);
            }
            minSum = Math.min(minSum, maxSum);
        }
        System.out.println(minSum);
    }
}
