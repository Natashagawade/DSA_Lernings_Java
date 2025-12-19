package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%n==0){
                System.out.println("Composit Number");
                break;
            }else{
                System.out.println("Prime Number");
                break;
            }

        }
    }
}
