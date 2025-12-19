package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int r = 0;
        int sum = 0;
        while(n!=0){
            r *=10;
            sum += n%10;
            r +=(n%10);
            n/=10;
        }
        System.out.println(r);
        System.out.println(sum);
    }
}
