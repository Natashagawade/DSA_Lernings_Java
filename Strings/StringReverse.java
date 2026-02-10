package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String s = " Natasha";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);
//        sb.deleteCharAt(1);
        sb.delete(2,6);
        System.out.println(sb);
    }
}
