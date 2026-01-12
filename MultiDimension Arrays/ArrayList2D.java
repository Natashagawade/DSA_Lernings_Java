package MultiDimensionArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(13); a.add(36); a.add(132);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(2); b.add(3); b.add(4);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2); c.add(3); c.add(5); c.add(7);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
        }
    }
}
