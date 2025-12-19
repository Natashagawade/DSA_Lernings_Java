package if_else;

import java.util.Scanner;

public class NoDivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        if(n%3==0 || n%5 == 0){
            System.out.println("divisible by 3 or 5");
        }else{
            System.out.println("not divisible by 3 or 5");
        }
    }
}
