package BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree =new BinarySearchTree();
        int[] array={10,4,29,35,18,27,5,13};
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }
        System.out.println();
        BinarySearchTree.TreeNode  ret =binarySearchTree.search(18);
        System.out.println(ret.key);
    }
}
