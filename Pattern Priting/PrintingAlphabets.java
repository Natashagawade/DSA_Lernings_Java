package PatternPrinting;

import java.util.Scanner;

public class PrintingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1 ; j<=n; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
//        for(int i=65;i<=67;i++){
//            for(int j=65;j<=67;j++){
//                System.out.print((char)i+" ");
//            }
//            System.out.println();
//        }
    }
}
