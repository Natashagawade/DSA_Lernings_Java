package Methods;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swap(5,6);
    }
    public static int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
        return 0;
    }
}
