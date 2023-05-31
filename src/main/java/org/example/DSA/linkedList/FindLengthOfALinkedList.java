package org.example.DSA.linkedList;

public class FindLengthOfALinkedList {
    Node head;
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public int getCount(){
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        FindLengthOfALinkedList list=new FindLengthOfALinkedList();
        list.push(1);
        list.push(3);
        list.push(1);
        list.push(2);
        list.push(16);
        list.push(4);
        System.out.println("Count of nodes is :"+list.getCount());
    }
}
