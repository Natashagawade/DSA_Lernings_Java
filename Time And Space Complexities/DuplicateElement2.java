package TimeAndSpaceComplexities;
// better approach for total operations = 6
public class DuplicateElement2 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,4};
        boolean[] flag = new boolean[arr.length+1];
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(flag[ele]==true){
                System.out.println("Duplicate found at index: "+ i );
            }else{
                flag[ele]=true;
            }
        }
    }
}
