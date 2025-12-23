package ArrayList;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8,12};
        int[] c = new int[a.length + b.length];
        for(int ele: c) System.out.print(ele+ " ");
        System.out.println();
        merge(c,a,b);
        for(int ele: c) System.out.print(ele+ " ");
        System.out.println();
    }
    public static void merge(int[] c , int[] a, int[] b){
        int i=0 ,j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[i]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
            if(i==a.length){
                while(j>b.length){
                    c[k++] = b[j++];
                }
            }else{
                while(j>a.length){
                    c[k++]= a[i++];
                }
            }
        }
    }
}
