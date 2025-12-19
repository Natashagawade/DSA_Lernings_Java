package if_else;

import java.util.Scanner;

public class AreaVsPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and Breadth of Rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int a = l*b;
        int p = 2*(l+b);
        if(p>a){
            System.out.println("Perimeter is more than area");
        }else{
            System.out.println("Area is more than perimeter");
        }
    }
}
