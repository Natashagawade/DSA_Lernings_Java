package Arrays;

class ArrayADT{
    int[] arr;
    int size;
    int capacity;
    ArrayADT(int size){
        this.size = 0;
        this.arr = new int[size];
        this.capacity = size;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Array is Empty");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void insertInSortedArray(int val){
        if(isFull()){
            System.out.println("Overflow");
        }
        int pos = size;
        for(int i=0;i<size;i++){
            if(arr[i] > val){
                pos = i;
                break;
            }
        }
        insertAtIndex(pos,val);
//        for(int i=size-1;i>=pos;i--){
//            arr[i+1] = arr[i];
//        }
//        arr[pos] = val;
//        size++;
    }

    void add(int index,int val){
        if(index >= capacity){
            System.out.println("Invalid Index");
            return;
        }

        arr[index] = val;
        size++;
    }

    void insertAtIndex(int index,int val){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        if(index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        for(int i=size-1;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = val;
        size++;
    }

    void DeleteAtIndex(int index){
        if(isEmpty()){
            System.out.println("UnderFlow");
            return;
        }
        if(index < 0 || index >= size){
            System.out.println("Invalid Index");
            return;
        }
        for(int i=index;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    int insertAtFirst(int val){
        if(isFull()){
            System.out.println("Overflow");
            return -1;
        }
        for(int i=size-1;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = val;
        size++;
        return -1;
    }

    int interpolationSearch(int key){
        int left = 0;
        int right = size-1;
        while(right>=left){
            int mid = left+((key-arr[left])*(right-left))/(arr[right]-arr[left]);
            if(arr[mid]>key){
                right = mid-1;
            }else if(arr[mid]<key){
                left = mid+1;
            } else if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
                break;
            }else{
                System.out.println("Element not present in Array");
                break;
            }
        }
        return -1;
    }

    int BinarySearch(int key){
        int left = 0;
        int right = size-1;
        while(right>=left){
            int mid = (right+left)/2;
            if(arr[mid]>key){
                right = mid-1;
            }else if(arr[mid]<key){
                left = mid+1;
            } else if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
                break;
            }else{
                System.out.println("Element not present in Array");
                break;
            }
        }
        return -1;
    }

    int deleteAtFirst(){
        int temp= arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return temp;
    }

    boolean isFull(){
        return size==capacity;
    }

    boolean isEmpty(){
        return size == 0;
    }

    void reverseArray(){
        int i=0;
        int j = size-1;
        int mid = (j+i)/2;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    void reverseInBetween(int i, int j){
        int mid = (i+j)/2;
        for(int k=i;k<mid;k++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    boolean ispalindrome(){
//        int[] ans = new int[size];
//        for(int i=size;i>=0;i++){
//            ans[i]=arr[i];
//        }
//        for(int i=0;i<=size-1;i++){
//            if(ans[i]==arr[i]) return true;
//        }
//        return false;
        for(int i=0;i<size/2;i++){
            if(arr[i]!=arr[size-1-i]){
                System.out.println("Not a Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    void rightShiftby1(){
        int temp = arr[size-1];
        for(int i=size-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    void leftShiftby1(){
        int temp = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = temp;
    }

    void leftShiftByk(int k){
        for(int i=0;i<k;i++){
            leftShiftby1();
        }
    }

    void rightShiftByk(int k){
        for(int i=0;i<k;i++){
            rightShiftby1();
        }
    }

    void Lshift(int k){
        reverseInBetween(0,k-1);        //Reverse Trick
        reverseInBetween(k,size-1);        //Acyclic
        reverseArray();
//        reverseInBetween(1,size-1);
    }

    void Rshift(int k){
        reverseArray();
        reverseInBetween(0,k-1);
        reverseInBetween(k,size-1);
    }

    void mergeSortedArray(ArrayADT arr1, ArrayADT arr2){
        int m = arr1.size;
        int n = arr2.size;
        int k = m+n;
        int[] ans = new int[k];
        int i=0;
        int j=0;
        int l=0;
        while(i < m && j < n){
            if(arr1.arr[i]<arr2.arr[j]){
                ans[l]=arr1.arr[i];
                i++;
                l++;
            }
            else if(arr2.arr[j]<=arr1.arr[i]){
                ans[l]=arr2.arr[j];
                j++;
                l++;
            }
        }
        while(i < m){
            ans[l] = arr1.arr[i];
            i++;
            l++;
        }
        while(j < n){
            ans[l] = arr2.arr[j];
            j++;
            l++;
        }
        for(int a=0;a<k;a++){
            System.out.print(ans[a]+" ");
        }
    }

    void swap(int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    void bubbleSort(){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j+1,j);
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void SelectionSort(){
        for(int i=0;i<size-1;i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            swap(min, i);
        }
    }

}

public class ArrayUser {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array:");
//        int n = sc.nextInt();
        ArrayADT arr1 = new ArrayADT(10);
//        ArrayADT arr2 = new ArrayADT(5);
//        ArrayADT ans = new ArrayADT(15);

        arr1.add(0,10);
        arr1.add(1,8);
        arr1.add(2,80);
        arr1.add(3,32);
        arr1.add(4,62);

        arr1.SelectionSort();
        arr1.print();

//        arr1.bubbleSort();

//        arr2.add(0,67);
//        arr2.add(1,35);
//        arr2.add(2,95);

//        ans.mergeSortedArray(arr1, arr2);

//        System.out.print("Enter Array Elements:");
//        for(int i=0;i<n;i++){
//            arr.add(i, sc.nextInt());
//        }

//        arr.print();
//        System.out.println();
//        arr.deleteAtFirst();
//        arr.insertAtFirst(23);
        //System.out.println("Enter element to be searched:");
        //int a = sc.nextInt();
//        arr.BinarySearch(a);
        //arr.interpolationSearch(a);

//        arr.add(0,10);
//        arr.add(1,20);
//        arr.add(2,30);
//        arr.add(3,40);
//        arr.add(4,50);
//        arr.add(5,60);

        //arr.print();
//        arr.insertAtIndex(3,67);
//        System.out.println();
//        arr.print();
//        arr.DeleteAtIndex(5);
//        System.out.println();
//        arr.print();
//        System.out.println();
//        arr.insertInSortedArray(20);
//        arr.print();
//        System.out.println();
//        arr.insertInSortedArray(35);
//        arr.print();
        //arr.reverseArray();
//        arr.print();
//        System.out.println();
//        arr.reverseInBetween(2,4);
//        arr.print();
//        System.out.println();
//        arr.ispalindrome();
//        arr.rightShiftby1();
//        arr.print();
//        arr.Lshift(3);
//        System.out.println();
//        arr.print();
//        arr.Rshift(3);
//        System.out.println();
//        arr.print();
    }
}
