package Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 12300;
        System.out.println(rev(n,0));
    }
    public static int rev(int n , int r){
        if(n==0) return r;
        return rev(n/10,r*10+n%10);
    }
}
