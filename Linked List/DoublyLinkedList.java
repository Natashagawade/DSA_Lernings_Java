package LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL {
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next= head;
            head.prev = temp;
            head= temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void display(){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void deleteAtHead(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        if(size==1) head = tail = null;
        else{
            head=head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        if(size==1) head = tail = null;
        else{
            tail=tail.prev;
            tail.next = null;
        }
        size--;
    }
    void insertAtIndex(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        node.next.prev = node;
        size++;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();
//        list.displayReverse();
//        list.deleteAtHead();
//        list.deleteAtTail();
//        list.display();
    }
}
