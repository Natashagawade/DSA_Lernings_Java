package BasicSortingAlgorithms;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] a = {3, 7, 6, 5, 4, 0, 9, 7, 1, 5};
        int[] b = {9, 7, 4, 8, 2, 1, 4, 9, 0, 6, 7};

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[Math.min(a.length, b.length)];

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans[k] = a[i];
                k++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.print("Common elements: ");
        for (int x = 0; x < k; x++) {
            System.out.print(ans[x] + " ");
        }
    }
}