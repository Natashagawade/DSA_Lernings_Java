package Strings;

public class MostFrequencyArray3 {
    public static void main(String[] args) {
        String s = " Natasha";
        int n =  s.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            freq[idx]++;
        }
        int maxFreq = -1;
        char ans = s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        System.out.println(ans);
    }
}
