package if_else;

import java.util.Scanner;

public class GreetestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Greater number"+ a);
        }else if(b>c && b>a){
            System.out.println("Greater number"+ b);
        }else{
            System.out.println("Greater number"+ c);
        }
    }
}
