package org.example.treeproblem;
class Node5{
    int data;
    Node5 left,right,nextRight;
    Node5(int item){
        data=item;
        left=right=nextRight=null;
    }
}
public class CheckIfSubTree {
    Node5 root1,root2;
    boolean areIdentical(Node5 root1, Node5 root2)
    {
        if (root1==null && root2==null)
            return true;
        if (root1==null||root2==null)
            return false;
        return (root1.data==root2.data && areIdentical(root1.left,root2.left)&& areIdentical(root1.right,root2.right));
    }
    boolean isSubtree(Node5 T, Node5 S)
    {
        /* base cases */
        if (S == null)
            return true;

        if (T == null)
            return false;

        /* Check the tree with root as current node */
        if (areIdentical(T, S))
            return true;

        /* If the tree with root as current node doesn't
           match then
           try left and right subtrees one by one */
        return isSubtree(T.left, S)
                || isSubtree(T.right, S);
    }
    public static void main(String[] args) {
    CheckIfSubTree tree=new CheckIfSubTree();
        tree.root1 = new Node5(26);
        tree.root1.right = new Node5(3);
        tree.root1.right.right = new Node5(3);
        tree.root1.left = new Node5(10);
        tree.root1.left.left = new Node5(4);
        tree.root1.left.left.right = new Node5(30);
        tree.root1.left.right = new Node5(6);
        tree.root2 = new Node5(10);
        tree.root2.right = new Node5(6);
        tree.root2.left = new Node5(4);
        tree.root2.left.right = new Node5(30);

        if (tree.isSubtree(tree.root1, tree.root2))
            System.out.println(
                    "Tree 2 is subtree of Tree 1 ");
        else
            System.out.println(
                    "Tree 2 is not a subtree of Tree 1");
    }
}
