package basic_chijee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle:");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate of Intrest");
        double r = sc.nextDouble();
        System.out.println("Enter the Time:");
        double t = sc.nextDouble();

        double si  = (p*r*t)/100;
        System.out.println(si);
    }
}
