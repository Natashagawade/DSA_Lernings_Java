package Loops;

import java.util.Scanner;

public class CountDigitsofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int N = sc.nextInt();
        int count = 0;
        while(N != 0){
            N/=10;
            count++;

        }
        System.out.println(count);
    }
}
