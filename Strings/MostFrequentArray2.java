package Strings;
import java.util.Arrays;
public class MostFrequentArray2 {
    public static void main(String[] args) {
        String s = "abcdefgscduvbisno";
        int n =  s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int j=0, i=0;
        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq = j-i;
                if(freq>maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i=j;
            }
        }
        int freq = j-i;
        if(freq>maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        System.out.println(ans);
    }
}
