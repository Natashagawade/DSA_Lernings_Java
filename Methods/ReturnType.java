package Methods;

public class ReturnType {
    public static void main(String[] args) {
        int x = natasha();
        System.out.println(3+x);
        natasha();
    }
    public static int natasha(){
        System.out.println("Line 1");
        System.out.println("Line 2");
        return 5;
    }
}
