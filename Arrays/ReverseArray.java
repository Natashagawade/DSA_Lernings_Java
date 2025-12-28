package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6,8,5,4,3,9,7};
        int n = arr.length;
        int i = 0, j =n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
