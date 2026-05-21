package BinaryTrees;

import java.util.Queue;
import java.util.LinkedList;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    int val;
    Node node;
    int level;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
public class Implementation {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(0);
        Node f = new Node(6);
        Node g = new Node(0 );
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
//        display(a);
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(Product(a));
//        System.out.println(productNonZero(a));
//        System.out.println(max(a));
//        System.out.println(levels(a));
//        System.out.println();
//        Inorder(a);
//        System.out.println();
//        Preorder(a);
//        System.out.println();
//        Postorder(a);
//        System.out.println();
        LevelOrderLineWise(a);
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+ " ");
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int Product(Node root){
        if(root==null) return 1;
        return root.val * Product(root.left) * Product(root.right);
    }
    public static int productNonZero(Node root){
        if(root==null) return 1;
        if(root.val==0) return 1;
        return root.val * productNonZero(root.left) * productNonZero(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public static void Inorder(Node root){
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    public static void Preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Postorder(Node root){
        if(root==null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void LevelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int currLevel=0;
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!=currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
        }
        System.out.println();
    }
}