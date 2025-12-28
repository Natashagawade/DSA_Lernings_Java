package Arrays;

public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[] = {23,53,34,22,45,64,43,25,32,67,54,21};
        int target = 64;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                System.out.println("Element "+ target + " found at index:" + i);
            }
        }
    }
}
