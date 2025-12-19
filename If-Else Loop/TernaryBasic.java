package if_else;

import java.util.Scanner;

public class TernaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        System.out.println(n%2==0 ? "Even" : "odd");
    }
}
