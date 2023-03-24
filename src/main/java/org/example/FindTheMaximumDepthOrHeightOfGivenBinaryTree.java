package org.example;
class Node{
    int data;
    Node left,right;
    Node(int item){
        data=item;
        left=right=null;
    }
}
public class FindTheMaximumDepthOrHeightOfGivenBinaryTree {
    Node root;

    int maxDepth(Node node){
        if (node==null)
            return 0;
        else {
            int lDepth=maxDepth(node.left);
            int rDepth=maxDepth(node.right);
            if (lDepth>rDepth)
                return (lDepth+1);
            else
                return (rDepth+1);
        }
    }
    public static void main(String[] args) {
    FindTheMaximumDepthOrHeightOfGivenBinaryTree trees=new FindTheMaximumDepthOrHeightOfGivenBinaryTree();
        trees.root=new Node(1);
        trees.root.left=new Node(2);
        trees.root.right=new Node(3);
        trees.root.left.left=new Node(4);
        trees.root.right.right=new Node(5);
        System.out.println("Height of tree is "+trees.maxDepth(trees.root));
    }
}
