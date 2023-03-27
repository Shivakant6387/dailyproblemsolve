package org.example.treeproblem;

import java.util.Stack;

class Node1
{
    int data;

    Node1 leftChild;
    Node1 rightChild;
    Node1(int data)
    {
        this.data = data;
    }
}
class BinaryTree {
    Node1 rootNode;

    // function to print the
// zigzag traversal
    void printZigZagTraversal() {

        // if null then return
        if (rootNode == null) {
            return;
        }

        // declare two stacks
        Stack<Node1> currentLevel = new Stack<>();
        Stack<Node1> nextLevel = new Stack<>();

        // push the root
        currentLevel.push(rootNode);
        boolean leftToRight = true;

        // check if stack is empty
        while (!currentLevel.isEmpty()) {

            // pop out of stack
            Node1 node = currentLevel.pop();

            // print the data in it
            System.out.print(node.data + " ");

            // store data according to current
            // order.
            if (leftToRight) {
                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }

                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }
            }
            else {
                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }

                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node1> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
}
public class ZigzagTreeTraversal {
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.rootNode = new Node1(1);
        tree.rootNode.leftChild = new Node1(2);
        tree.rootNode.rightChild = new Node1(3);
        tree.rootNode.leftChild.leftChild = new Node1(7);
        tree.rootNode.leftChild.rightChild = new Node1(6);
        tree.rootNode.rightChild.leftChild = new Node1(5);
        tree.rootNode.rightChild.rightChild = new Node1(4);

        System.out.println("ZigZag Order traversal of binary tree is");
        tree.printZigZagTraversal();
    }
}
