package BinaryTree;

import javax.swing.tree.TreeNode;

public class test {
    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree();
        BinaryTree.TreeNode root=binaryTree.createTree();
        binaryTree.levelOrder(root);


    }
}
