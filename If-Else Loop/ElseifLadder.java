package if_else;

import java.util.Scanner;

public class ElseifLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("Divisible by 3 and 5");
        }else if(n%5==0){
            System.out.println("Divisible by 5");
        }else if(n%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
