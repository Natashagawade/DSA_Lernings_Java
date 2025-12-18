package basic_chijee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        System.out.println(n*n);
    }
}
