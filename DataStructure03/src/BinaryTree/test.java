package BinaryTree;

import javax.swing.tree.TreeNode;

public class test {
    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree();
        BinaryTree.TreeNode root=binaryTree.createTree();
        binaryTree.size1(root);
        System.out.println(BinaryTree.nodeSize);
        System.out.println(binaryTree.size2(root));;
        binaryTree.getLeafNodeCount1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafNodeCount2(root));
        System.out.println(binaryTree.getKLevelNodeCount(root,4));
        System.out.println(binaryTree.getHigh(root));
        System.out.println(binaryTree.find(root,'C'));
        System.out.println(binaryTree.levelOrder1(root));

    }
}
