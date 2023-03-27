package BinaryTree;

public class BinaryTree {
    public class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(char val){
            this.val =val;
        }
    }
    public  TreeNode root;
    public  void createTree(){
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left =B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;
        root =A;
    }

    void preOrder(TreeNode root){
     if (root ==null)  return;
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void inOrder(TreeNode root){
      if(root==null)  return;
        inOrder(root.left);
        System.out.println(root.val+ " ");
        inOrder(root.right);
    }
    void postOrder(TreeNode root){
       if(root==null)  return;
       postOrder(root.left);
       postOrder(root.right);
        System.out.println(root.val+" ");
    }
}

