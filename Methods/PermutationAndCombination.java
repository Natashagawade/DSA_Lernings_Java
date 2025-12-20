package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        System.out.println("Permutation is : " + Permutation(n,r));
        System.out.println("Combination is : " + combination(n,r));
    }
    public static int fact(int x){
        int f = 1;
        for(int i=1;i<=x;i++){
            f *=i;
        }
        return f;
    }
    public static int Permutation(int n, int r){
        int npr = fact(n)/fact(n-r);
        return npr;
    }
    public static int combination(int n, int r){
        int ncr = fact(n)/(fact(r)*fact(n-r));
        return ncr;
    }
}
