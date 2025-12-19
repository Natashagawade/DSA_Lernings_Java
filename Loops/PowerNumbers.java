package Loops;

import java.util.Scanner;

public class PowerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = sc.nextInt();
        System.out.print("Enter Power:");
        int b = sc.nextInt();
        int pow = 1;
        while(b!=0){
            pow =a*a;
            b--;
        }
        System.out.println(pow);
    }
}
