package Methods;

import java.util.Scanner;

public class MaximumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        max(a,b);
    }
    public static void max(int a, int b){
        System.out.println(Math.max(a,b));
    }
}
