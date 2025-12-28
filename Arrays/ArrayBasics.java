package Arrays;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
