package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        if(n%2==0){
            n++;
        }
        int mid = n/2;

        for(int i=0; i<n ;i++){
            for(int j=0; j<n ; j++){
                if(i==mid || j==mid ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
