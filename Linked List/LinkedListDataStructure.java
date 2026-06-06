package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    int Search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp!=null){
            if(temp.val == val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    void insertAtIndex(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0) addAtHead(val);
        else if (idx==size) addAtTail(val);
        else{
            Node temp = head;
            for(int i=0;i<idx-1;i++){
               temp = temp.next;
            }
            Node InsNode = new Node(val);
            InsNode.next = temp.next;
            temp.next = InsNode;
            size++;
        }
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void deleteAtIndex(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0) deleteAtHead();
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size-1){
            tail = temp;
        }
        size--;
    }
}
public class LinkedListDataStructure {
    private static int get(Node head, int idx){
        Node temp =  head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
//        l1.deleteAtHead();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(50);
        l1.addAtTail(60);
//        l1.display();
//        l1.addAtHead(0);
//        l1.display();
//        l1.addAtHead(-10);
//        l1.display();
//        l1.deleteAtHead();
//        l1.deleteAtHead();
//        l1.display();
//        System.out.println(l1.Search(30));
//        System.out.println(l1.Search(100));
        l1.deleteAtIndex(6);
        l1.display();
    }
}