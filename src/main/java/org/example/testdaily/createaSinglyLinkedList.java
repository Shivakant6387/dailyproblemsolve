package org.example.testdaily;
public class createaSinglyLinkedList {
    Node head;
    // not using parameterized constructor would by default
    // force head instance to become null
    // Node head = null;  // can also do this, but not required

    // Node Class
    class Node {
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }

    public Node insertNode(int data) {
        // Using constructor to create memory and value assignment
        Node new_node = new Node(data);
        // current head becomes this new_node's next
        new_node.next = head;

        // changing head to this newly created node
        head = new_node;

        return head;
    }


    public void display()
    {
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        createaSinglyLinkedList list=new createaSinglyLinkedList();
        list.insertNode(25);
        list.insertNode(20);
        list.insertNode(15);
        list.insertNode(10);
        list.insertNode(5);
        list.display();
    }
}
