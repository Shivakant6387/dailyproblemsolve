package org.example.DSA.linkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class SearchAnElementInALinkedList {
    Node head;
    public void push(int new_data){
    Node new_node=new Node(new_data);
    new_node.next=head;
    head=new_node;
    }
    public boolean search(Node head,int x){
        if (head==null)
            return false;
        if (head.data==x)
            return true;
        return search(head.next,x);
    }

    public static void main(String[] args) {
        SearchAnElementInALinkedList llist = new SearchAnElementInALinkedList();

        /* Use push() to construct below list
           14->21->11->30->10  */
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
        int x = 10;
        // Function call
        if (llist.search(llist.head, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
