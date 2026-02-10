package Strings;

public class InterningNewKeywords {
    public static void main(String[] args) {
//        String s1 ="Natasha";
//        String s2 ="Natasha";
//        System.out.println(s1==s2);          //true for same address

//        String s1 =new String("Natasha");
//        String s2 =new String("Natasha");
//        System.out.println(s1==s2);            //false for diffrent address

        String s1 =new String("Natasha");
        String s2 =new String("Natasha");
        System.out.println(s1.equals(s2));       //true because strings are compared
    }
}
