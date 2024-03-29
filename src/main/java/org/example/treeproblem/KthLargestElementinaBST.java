package org.example.treeproblem;

public class KthLargestElementinaBST {
    static class Node{
        int data;
        Node left,right;
    }
    static Node newNode(int data){
        Node temp=new Node();
        temp.data=data;
        temp.right=null;
        temp.left=null;
        return temp;
    }
    static Node KthLargestUsingMorrisTraversal(Node root, int k)
    {
        Node curr=root;
        Node kLargest=null;
        int count=0;
        while (curr!=null){
            if (curr.right==null){
                if (++count==k)
                    kLargest=curr;
                curr=curr.left;
            }
            else {
                Node succ=curr.right;
                while (succ.left!=null && succ.left!=curr)
                    succ=succ.left;
                if (succ.left==null){
                    succ.left=curr;
                    curr=curr.right;
                }
                else {
                    succ.left=null;
                    if (++count==k)
                        kLargest=curr;
                    curr=curr.left;
                }
            }
        }
        return kLargest;
    }
    public static void main(String[] args) {
    Node root=newNode(4);
    root.left=newNode(2);
    root.right=newNode(7);
    root.left.left=newNode(1);
    root.left.right=newNode(3);
    root.right.left=newNode(6);
    root.right.right=newNode(10);
        System.out.println("Finding K-th largest Node in BST : " + KthLargestUsingMorrisTraversal(root, 2).data);
    }
}
