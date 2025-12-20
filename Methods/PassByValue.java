package Methods;

public class PassByValue {
    public static void change(int x){
        x = 10;
        System.out.println(x);       //If this line is not added then it will only print 6 6
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
