package Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int arr[] = {2,9,8,6,7,5,4,1};
        int n =arr.length + 1;
        int sum = n*(n+1)/2;
        int ArraySum = 0;
        for(int ele : arr){
            ArraySum+=ele;
        }
        System.out.println(sum-ArraySum);
    }
}
