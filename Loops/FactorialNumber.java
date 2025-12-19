package Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        while(n!=0){
            f+=(n%10);
        }
    }
}
