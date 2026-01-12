package MultiDimensionArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        for(int i=0;i<arr.length;i++){
//            for(int ele : arr[i]){
//                System.out.println(ele+ " ");
//            }
//        }
        for(int[] e : arr){
            for(int ele : e){
                System.out.print(ele+ " ");
            }
        }
        System.out.println();
    }
}
