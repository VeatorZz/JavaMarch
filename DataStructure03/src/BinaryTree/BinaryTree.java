package BinaryTree;

import java.util.*;

public class BinaryTree {
    public class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public TreeNode root;

    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        root = A;
        return A;
    }

    void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.val + " ");
        inOrder(root.right);
    }

    void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val + " ");
    }

    public static int nodeSize;

    void size1(TreeNode root) {
        if (root == null) return;
        nodeSize++;
        size1(root.left);
        size1(root.right);
    }

    int size2(TreeNode root) {
        if (root == null) return 0;
        return size2(root.left) + size2(root.right) + 1;
    }


    public static int leafSize = 0;

    public void getLeafNodeCount1(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafNodeCount1(root.left);
        getLeafNodeCount1(root.right);
    }


    public int getLeafNodeCount2(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount2(root.left) + getLeafNodeCount2(root.right);
    }

    public int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null) return 0;
        if (k == 1) return 1;
        return getKLevelNodeCount(root.left, k - 1) + getKLevelNodeCount(root.right, k - 1);
    }


    public int getHigh(TreeNode root) {
//        if(root.left == null && root.right==null){
//            return 0;
//        }
        if (root == null) return 0;
        return Math.max(getHigh(root.left), getHigh(root.right)) + 1;
    }

    public TreeNode find(TreeNode root, char val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }
        TreeNode ret = find(root.left, val);
        if (ret != null) return ret;
        ret = find(root.right, val);
        if (ret != null) return ret;
        return null;
    }


    public void levelOrder(TreeNode root) {
        if (root == null) return;//把特殊情况拿出来
        Queue<TreeNode> queue = new LinkedList<>();//创建个队列
        queue.offer(root);//将root头放下
        while (!queue.isEmpty()) {//进入循环当队列等于空时出来
             //整体思路就是将root和root left和right 按顺序放在队列里,先进先出
            TreeNode cur = queue.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null) {//必须要把left 放前面
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }


    }

    public List<List<Character>> levelOrder1(TreeNode root) {//这个思路是一样的,只不过是按照每一层每一次层遍历,加了一个size,多了一个arraylist
        //每层先设好个数,然后--
        List<List<Character>> ret = new ArrayList<>();
        if (root == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            while (size != 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                size--;
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }

}

//    public List<Character> postorderTraversal(TreeNode root) {
//        List<Character> list =new ArrayList<>();
//        if(root !=null) return list;
//        Stack<TreeNode> stack =new Stack<>();
//        TreeNode cur =root;
//        while(cur!=null){
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        }
//    }
//}

