package OOPS;

class Cricketer{
    static String country = "NZ";
    int runs;
    String name;
    double avg;
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c2.country);
    }
}
