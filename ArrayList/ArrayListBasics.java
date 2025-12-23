package ArrayList;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(10);
        arr.add(15);
        arr.add(65);
        arr.add(46);
        arr.add(86);
        arr.add(45);

        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr.get(3));
        System.out.println(arr);

        arr.add(3,55);
        System.out.println(arr);

        int n = arr.size();
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        arr.remove(arr.size()-1);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
