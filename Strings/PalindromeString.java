package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "sbababs";
        int i=0;
        int j= s.length();
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            System.out.println("Is Palindrome");
        }
        System.out.println("Not a Palindrome");
    }
}
