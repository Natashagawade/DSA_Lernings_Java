package PatternPrinting;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number:");
        int n= sc.nextInt();
        int a = 1;
        for(int i=0 ;i<=n ;i++){
            for(int j=0; j<=i ; j++){
                if(a%2==1){
                    System.out.print(a);
                    a++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
