package LinkedList;
public class DisplayList {
    public static void DisplayRec(Node head){
        if(head == null) return;
//        System.out.print(head.val+" ");   //start to end list
        DisplayRec(head.next);
        System.out.print(head.val+" ");     //end to start list
    }
    public static void display(Node head){

                  //manual printing
//        System.out.print(head.val+" ");
//        System.out.print(head.next.val+" ");
//        System.out.print(head.next.next.val+" ");
//        System.out.print(head.next.next.next.val+" ");
//        System.out.print(head.next.next.next.next.val+" ");
//        System.out.print(head.next.next.next.next.next.val+" ");


                   // while loop
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();


                   //for loop
//        for(Node temp = head; temp!= null; temp=temp.next){
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();

    }
    public static void main(String[] args) {
        Node a = new Node(10);    //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        DisplayRec(a);
        System.out.println();
        display(a);
        get(a,3);
    }

    public static int get(Node head , int idx){
        Node temp = head;
        for(int i=1; i<=idx ; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
