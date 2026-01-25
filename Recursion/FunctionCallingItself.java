package Recursion;

import com.sun.security.jgss.GSSUtil;

public class FunctionCallingItself {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("Natasha");
        print();
    }
}
