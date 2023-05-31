package org.example.DSA.linkedList;

public class DeleteInLinkedList {
    public static int deleteNode(Node head,int val){
        if (head==null){
            System.out.println("Element not present in the list");
            return -1;
        }
        if (head.data==val){
            if (head.next!=null){
                head.data=head.next.data;
                head.next=head.next.next;
                return 1;
            }
            else
                return 0;
        }
        if (deleteNode(head.next,val)==0){
            head.next=null;
            return 1;
        }
        return -1;
    }
    public static Node push(Node head,int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
        return head;
    }
    public static void printList(Node head){
        if (head==null)
            return;
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=null;
        head = push(head, 10);
        head = push(head, 12);
        head = push(head, 14);
        head = push(head, 15);
        printList(head);
        deleteNode(head,10);
        printList(head);

    }
}
