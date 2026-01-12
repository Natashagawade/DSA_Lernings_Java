package TimeAndSpaceComplexities;

import java.util.Scanner;
// brutforce approach total operations = 14
public class DuplicateeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5,1,3,4};
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found at index: "+ i +" and "+ j);
                }
            }
        }
    }
}
