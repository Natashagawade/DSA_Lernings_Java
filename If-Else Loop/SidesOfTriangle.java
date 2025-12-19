package if_else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Sides of Triangle");
        }else{
            System.out.println("Not Sides of triangle");
        }
    }
}
