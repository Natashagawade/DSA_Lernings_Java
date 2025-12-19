package if_else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        double n = sc.nextDouble();
        //double x = (int)n;
        if(n == (int)n){
            System.out.println("Is an Integer");
        }else{
            System.out.println("Is not an Integer");
        }
    }
}
