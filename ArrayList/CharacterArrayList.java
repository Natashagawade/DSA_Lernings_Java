package ArrayList;

import java.util.ArrayList;

public class CharacterArrayList {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('N');
        arr.add('A');
        arr.add('T');
        arr.add('A');
        arr.add('S');
        arr.add('H');
        arr.add('A');
        System.out.println(arr);
        arr.set(0,'B');
        System.out.println(arr);
    }
}
