package Recursion;

public class APowB {
    public static void main(String[] args) {
        System.out.println(power(3,2));
    }

    public static int pow(int a, int b) {
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }

    public static int power(int a , int b) {
        if(b==0) return 1;
        return a*power(a,b-1);
    }
}
