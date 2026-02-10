package Strings;

public class PassingStringsToMethod {
    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println(x);
    }
    public static void change(int x){
        x = 23;
    }
}
