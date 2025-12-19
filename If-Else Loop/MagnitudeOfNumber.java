package if_else;

import java.util.Scanner;

public class MagnitudeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        if(n>0){
            System.out.println(n);
        }else{
            System.out.println(-n);
        }
    }
}
