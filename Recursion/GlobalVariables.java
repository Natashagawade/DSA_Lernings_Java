package Recursion;

public class GlobalVariables {
    static int x = 20;       // global variable
    public static void main(String[] args){
        fun();
        System.out.println(x);
    }

    public static void fun(){
        x = 20;
    }
}
