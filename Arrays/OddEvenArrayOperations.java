package Arrays;

public class OddEvenArrayOperations {
    public static void main(String[] args) {
        int[] arr = {56,34,76,63,77,21,44,54,65};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+10 + " ");
            }else{
                System.out.print(arr[i]*2 + " ");
            }
        }
    }
}
