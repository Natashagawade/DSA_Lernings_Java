package PatternPrinting;

import java.util.Scanner;

public class PrintingNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Square:");
        int s = sc.nextInt();
        for(int i = 1;i<=s;i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
