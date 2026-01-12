package TimeAndSpaceComplexities;
//most optimized approach
public class DuplicatElement3 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,4};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        //take sum of no from 1 to 5 and substract from sum
        //19-15 = 4 we gwt answer fast
    }
}
