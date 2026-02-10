package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Natasha");
        System.out.println(sb.length()+ " " + sb.capacity());
        System.out.println(sb);
        System.out.println(sb.append(" Gawade"));
        System.out.println(sb.length()+ " " + sb.capacity());
        System.out.println(sb.append(" I am Very happy"));
        System.out.println(sb.length()+ " " + sb.capacity());
        sb.setCharAt(14, ',');
        System.out.println(sb);
    }
}
