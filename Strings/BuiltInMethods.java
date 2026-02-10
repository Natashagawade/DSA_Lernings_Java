package Strings;

import javax.sound.midi.Soundbank;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Natasha";
        String s2 = "Nata";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("tasha"));
        System.out.println(s.startsWith("Nata"));
        System.out.println(s.compareTo(s2));
    }
}
