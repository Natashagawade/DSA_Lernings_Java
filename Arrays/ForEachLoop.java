package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {3,24,52,5,26,2,35,43,6,4,5,26,4,64,2,6,32};
        for(int ele : arr){       //For Each loop is only used for printing array not for changing
            System.out.print(ele+ " ");
        }
    }
}
