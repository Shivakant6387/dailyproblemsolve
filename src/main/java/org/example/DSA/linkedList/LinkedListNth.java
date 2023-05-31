package org.example.DSA.linkedList;

public class LinkedListNth {
    Node head;
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void printNthFormLast(int n){
        int len=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
        if (len<n)
            return;
        temp=head;
        for (int i=1;i<len-n+1;i++)
            temp=temp.next;
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        LinkedListNth list=new LinkedListNth();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(35);
        list.printNthFormLast(4);
    }
}
