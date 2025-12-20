package Methods;

public class MethodSyntax {
    public static void natasha(){
        System.out.println("Line 1");
    }
    public static void main(String[] args) {
        System.out.println("Line 2");
        natasha();
        System.out.println("Line 3");
        natasha();
    }
}
