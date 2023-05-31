package org.example.DSA.linkedList;

public class deleteFunctionLinkedList {
    Node head;
void deleteList(){
    head=null;
}
public void push(int new_data){
    Node new_node=new Node(new_data);
    new_node.next=head;
    head=new_node;
}
    public static void main(String[] args) {
        deleteFunctionLinkedList list=new deleteFunctionLinkedList();
        list.push(1);
        list.push(4);
        list.push(1);
        list.push(12);
        list.push(1);
        System.out.println("Deleting the list");
        list.deleteList();
        System.out.println("Linked list deleted");
    }
}
