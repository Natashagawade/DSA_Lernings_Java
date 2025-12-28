package Arrays;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Array Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=1;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
