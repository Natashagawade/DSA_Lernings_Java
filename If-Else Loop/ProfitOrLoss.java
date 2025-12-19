package if_else;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP:");
        int cp = sc.nextInt();
        System.out.print("Enter SP:");
        int sp = sc.nextInt();
//        int pl = sp-cp;
//        int pp =  ((sp-cp)/cp)*100;
//        int lp =  ((cp-sp)/cp)*100;
        int p = sp-cp;
        int l = cp-sp;
        int pp = p/cp*100;
        int lp = l/cp*100;
        if(sp-cp > 0) {
            System.out.print("Profit:");
            System.out.println(p);
            System.out.print("Profit Percent:");
            System.out.println(pp);
        }else if(cp==sp){
            System.out.println("No profit No loss");
        }else{
            System.out.print("loss:");
            System.out.println(l);
            System.out.print("Loss Percent:");
            System.out.println(lp);
        }
    }
}
