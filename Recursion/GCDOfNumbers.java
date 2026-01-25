package Recursion;

public class GCDOfNumbers {
    public static void main(String[] args) {
        int a = 1260;
        int b = 1420;
        int hcf = 1;
        for(int i=2;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
